public void open() throws java.io.IOException {
    if (!(append)) {
        new java.io.File(fileName).delete();
    }
    try {
        mem = new io.mappedbus.MemoryMappedFile(fileName, fileSize);
    } catch (java.lang.Exception e) {
        throw new java.io.IOException(("Unable to open the file: " + (fileName)), e);
    }
    if (append) {
        mem.compareAndSwapLong(Structure.Limit, 0, Structure.Data);
    }else {
        mem.putLongVolatile(Structure.Limit, Structure.Data);
    }
}