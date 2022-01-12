private void flushCached() throws java.io.IOException {
    if (((cachedValueCount) > 4) || ((cachedValue) == (com.grelobites.romgenerator.util.compress.z80.Z80OutputStream.COMPRESS_MARK))) {
        out.write(com.grelobites.romgenerator.util.compress.z80.Z80OutputStream.COMPRESS_MARK);
        out.write(com.grelobites.romgenerator.util.compress.z80.Z80OutputStream.COMPRESS_MARK);
        out.write(cachedValueCount);
        out.write(cachedValue);
    }else {
        while (((cachedValueCount)--) > 0) {
            out.write(cachedValue);
        } 
    }
}