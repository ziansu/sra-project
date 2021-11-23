@java.lang.Override
public int[] getRange(int offset, int quantity) throws com.invertor.modbus.exception.IllegalDataAddressException, com.invertor.modbus.exception.IllegalDataValueException {
    checkRange(offset, quantity);
    if (!(com.invertor.modbus.Modbus.checkReadRegisterCount(quantity)))
        throw new com.invertor.modbus.exception.IllegalDataAddressException(offset);
    
    return java.util.Arrays.copyOfRange(registers, offset, (offset + quantity));
}