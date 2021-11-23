private void addRegister(java.lang.String register) throws exceptions.TooManyRegistersException {
    if ((registers.size()) >= (sprocklGenerator.SprocklGenerator.REGISTERS)) {
        throw new exceptions.TooManyRegistersException();
    }else {
        if (!(registers.containsKey(register))) {
            registers.put(register, registers.size());
        }
    }
}