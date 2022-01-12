@java.lang.Override
public int read(byte[] bytes, int offset, int length) throws java.io.IOException {
    try {
        int count = file.read(bytes, offset, length);
        this.seekPosition += count;
        return count;
    } catch (org.sleuthkit.datamodel.TskCoreException ex) {
        throw new java.io.IOException();
    }
}