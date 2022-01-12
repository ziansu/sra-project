@java.lang.Override
public synchronized void recv(com.sbpinvertor.modbus.utils.ByteFifo pdu) throws com.sbpinvertor.modbus.exception.ModbusTransportException {
    try {
        byte[] buffer = port.readBytes(Modbus.MAX_RESPONSE_TIMEOUT);
        if (buffer != null)
            pdu.write(buffer);
        
    } catch (java.lang.Exception e) {
        throw new com.sbpinvertor.modbus.exception.ModbusTransportException(e);
    }
    if ((pdu.getCrc()) != 0) {
        throw new com.sbpinvertor.modbus.exception.ModbusTransportException("CRC check failed");
    }
}