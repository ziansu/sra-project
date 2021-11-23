@java.lang.Override
public long write(java.io.RandomAccessFile file) {
    try {
        int padLen = getPadLen(file);
        file.write(new byte[]{ 0 });
        if (padLen > 0) {
            byte[] zeroPadding = new byte[padLen];
            file.write(zeroPadding);
        }
        return ((long) (padLen)) + 1;
    } catch (java.io.IOException e) {
        throw new no.edh.index.entry.operations.exceptions.WriteOperationException("Failed to write zero-padding", e);
    }
}