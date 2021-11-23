@java.lang.Override
public void readFields(java.io.DataInput dis) throws java.io.IOException {
    int length = dis.readInt();
    byte[] bytes = new byte[length];
    dis.readFully(bytes);
    this.key = bytes;
    this.deletedAt = dis.readLong();
    boolean hasAtom = dis.readBoolean();
    if (hasAtom) {
        this.atom = serializer.deserializeFromSSTable(dis, ColumnSerializer.Flag.PRESERVE_SIZE, java.lang.Integer.MIN_VALUE, version);
    }
}