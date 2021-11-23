private static void lb(java.lang.String register, java.lang.String data) {
    components.RegisterFile.writeToRegister(components.RegisterFile.readRegisterWithAddress(register), data);
}