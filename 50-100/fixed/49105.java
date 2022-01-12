public T next() {
    if ((in.valueCount()) >= (blocks[block].valueCount)) {
        if ((block) >= (blocks.length))
            throw new org.apache.trevni.TrevniRuntimeException("Read past end of column.");
        
        readChecksum(in);
        (block)++;
        in.valueCount(0);
    }
    try {
        return ((T) (in.readValue(type)));
    } catch (java.io.IOException e) {
        throw new org.apache.trevni.TrevniRuntimeException(e);
    }
}