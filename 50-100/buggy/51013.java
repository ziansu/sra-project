@java.lang.Override
public synchronized void recv(com.sbpinvertor.modbus.utils.ByteFifo pdu) throws com.sbpinvertor.modbus.exception.ModbusTransportException {
    try {
        pdu.write(port.readBytes(1, Modbus.MAX_RESPONSE_TIMEOUT));
        if ((port.hasBytes()) < (com.sbpinvertor.modbus.Modbus.MIN_MESSAGE_LENGTH)) {
            throw new com.sbpinvertor.modbus.exception.ModbusTransportException("Incomplete response");
        }else
            pdu.write(port.readBytes());
        
        if ((pdu.getCrc()) != 0) {
            throw new com.sbpinvertor.modbus.exception.ModbusTransportException("CRC check failed");
        }
    } catch (java.lang.Exception e) {
        throw new com.sbpinvertor.modbus.exception.ModbusTransportException(e);
    }
}