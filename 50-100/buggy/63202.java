public void encode(org.terracotta.runnel.utils.WriteBuffer byteBuffer, boolean withIndex) {
    if (withIndex) {
        byteBuffer.putVlqInt(index);
    }
    int size = 0;
    for (org.terracotta.runnel.encoding.dataholders.DataHolder value : values) {
        size += value.size(false);
    }
    size += org.terracotta.runnel.utils.VLQ.encodedSize(size);
    byteBuffer.putVlqInt(size);
    byteBuffer.putVlqInt(values.size());
    for (org.terracotta.runnel.encoding.dataholders.DataHolder value : values) {
        value.encode(byteBuffer, false);
    }
}