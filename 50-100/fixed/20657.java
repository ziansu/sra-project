private void addRegister(java.lang.String register) throws exceptions.TooManyRegistersException {
    if (!(registers.containsKey(register))) {
        if ((registers.size()) >= (sprocklGenerator.SprocklGenerator.REGISTERS)) {
            throw new exceptions.TooManyRegistersException();
        }else {
            registers.put(register, registers.size());
        }
    }
}