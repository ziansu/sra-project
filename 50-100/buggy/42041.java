public T next() {
    if ((in.valueCount()) < (blocks[block].valueCount)) {
        if ((block) < ((blocks.length) - 1))
            throw new org.apache.trevni.TrevniRuntimeException("Read past end of column.");
        
        (block)++;
        readChecksum(in);
    }
    try {
        return ((T) (in.readValue(type)));
    } catch (java.io.IOException e) {
        throw new org.apache.trevni.TrevniRuntimeException(e);
    }
}