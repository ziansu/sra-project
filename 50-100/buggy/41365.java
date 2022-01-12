@org.junit.jupiter.api.Test
void addConstantToRegister() {
    de.attila.chip8emulator.Chip8 parenttest = new de.attila.chip8emulator.Chip8("");
    parenttest.setCpuRegister(1, ((byte) (5)));
    parenttest.writeToMemory(512, ((byte) (113)));
    parenttest.writeToMemory(513, ((byte) (5)));
    parenttest.emulateCycle();
    org.junit.jupiter.api.Assertions.assertEquals(((byte) (10)), parenttest.getCpuRegister(1), "Value of Register 0 should be 10, but isnt");
}