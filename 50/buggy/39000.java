public void memorySave(int addr, byte[] value) {
    memory.write(addr, value, false);
}