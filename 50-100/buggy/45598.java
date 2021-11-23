public void loadRomIntoMemory(byte[] array) {
    emulator = new com.gregorybahr.chip8emulator.emulators.chip8.Chip8();
    byte[] bytes = array;
    emulator.getMemory().reset();
    for (int i = 0; i < (bytes.length); i++) {
        emulator.getMemory().write(((bytes[i]) & 255), (512 + i));
    }
}