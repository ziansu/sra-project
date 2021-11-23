@java.lang.Override
public void frameCheck() throws com.invertor.modbus.exception.ModbusChecksumException, java.io.IOException {
    int r_crc = readShortLE();
    int c_crc = getCrc();
    if ((c_crc == 0) && (r_crc == 0)) {
        return ;
    }
    if ((c_crc != 0) || (r_crc == 0)) {
        throw new com.invertor.modbus.exception.ModbusChecksumException(r_crc, c_crc);
    }
}