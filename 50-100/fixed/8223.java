public boolean subtractFromRegistry(int registryIndex, byte value) {
    boolean borrow = false;
    int result = ((chip8.getRegisters()[registryIndex]) & 255) - (value & 255);
    if (result < 0) {
        borrow = true;
        result = (255 - (result * (-1))) + 1;
    }
    chip8.getRegisters()[registryIndex] = ((byte) (result));
    return borrow;
}