@java.lang.Override
public boolean[] getRange(int offset, int quantity) throws com.invertor.modbus.exception.IllegalDataAddressException, com.invertor.modbus.exception.IllegalDataValueException {
    if (!(com.invertor.modbus.Modbus.checkReadCoilCount(quantity)))
        throw new com.invertor.modbus.exception.IllegalDataValueException();
    
    checkRange(offset, quantity);
    return java.util.Arrays.copyOfRange(coils, offset, (offset + quantity));
}