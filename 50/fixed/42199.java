public void putPkg(byte[] data) {
    synchronized(spool) {
        spool.add(data);
    }
}