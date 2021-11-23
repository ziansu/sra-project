public void setRegister(int address, int value) {
    value = pic_simulator.utils.BinaryNumberHelper.truncateToNBit(value, 8);
    address = pic_simulator.utils.BinaryNumberHelper.truncateToNBit(address, 7);
    address = pic_simulator.utils.BinaryNumberHelper.setBit(address, 7, getSTATUSbitRP0());
    java.util.List<java.lang.Integer> registers = pic_simulator.model.RegisterAddressDecoder.getAllRegistersForAddress(address);
    for (java.lang.Integer register : registers) {
        _notifier.changedRegister(register, getRegister(register), value);
        _registers.put(register, value);
    }
}