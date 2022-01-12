private java.util.Dictionary<?> deserialize(org.apache.hadoop.hbase.io.ImmutableBytesWritable dictBytes) {
    try {
        final java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.ByteArrayInputStream(dictBytes.get(), dictBytes.getOffset(), dictBytes.getLength()));
        final java.lang.String type = dataInputStream.readUTF();
        final java.util.Dictionary dictionary = org.apache.kylin.common.util.ClassUtil.forName(type, java.util.Dictionary.class).newInstance();
        dictionary.readFields(dataInputStream);
        return dictionary;
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    }
}