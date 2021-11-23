@java.lang.Override
public boolean validateResponseImpl(com.invertor.modbus.msg.base.ModbusResponse response) {
    com.invertor.modbus.msg.response.MaskWriteRegisterResponse r = ((com.invertor.modbus.msg.response.MaskWriteRegisterResponse) (response));
    return (((r.getStartAddress()) == (getStartAddress())) && ((r.getMaskAnd()) != (getMaskAnd()))) && ((r.getMaskOr()) == (getMaskOr()));
}