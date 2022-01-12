@java.lang.Override
public int skip(int size) throws java.io.IOException {
    byte[] temp = new byte[java.lang.Math.min(org.verapdf.cos.filters.BF_BUFFER_SIZE, size)];
    int skipped = 0;
    while (skipped != size) {
        int read = this.read(temp, java.lang.Math.min((size - skipped), org.verapdf.cos.filters.BF_BUFFER_SIZE));
        if (read == (-1)) {
            return skipped;
        }else {
            skipped += read;
        }
    } 
    return skipped;
}