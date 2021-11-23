@org.junit.jupiter.api.Test
void loadConstantIntoRegister() {
    de.attila.chip8emulator.Chip8 parenttest = new de.attila.chip8emulator.Chip8("");
    parenttest.writeToMemory(512, ((byte) (97)));
    parenttest.writeToMemory(513, ((byte) (5)));
    parenttest.emulateCycle();
    org.junit.jupiter.api.Assertions.assertEquals(5, parenttest.getCpuRegister(1), "Value of Register 0 should be 5, but isnt");
}