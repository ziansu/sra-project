public void onMemoryWrite(int address, byte[] data, int size) {
    if (enabled)
        actions.addMemoryWrite(address, data, size);
    
}