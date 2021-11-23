public synchronized boolean writeFile(int id, byte[] data, int length) {
    return writeFile(id, data, length, true) ? true : writeFile(id, data, length, false);
}