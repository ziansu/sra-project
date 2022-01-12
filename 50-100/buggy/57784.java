private void makeColumn(final io.druid.java.util.common.io.smoosh.FileSmoosher v9Smoosher, final java.lang.String columnName, final io.druid.segment.column.ColumnDescriptor serdeficator) throws java.io.IOException {
    io.druid.io.ZeroCopyByteArrayOutputStream specBytes = new io.druid.io.ZeroCopyByteArrayOutputStream();
    serializerUtils.writeString(specBytes, mapper.writeValueAsString(serdeficator));
    try (io.druid.java.util.common.io.smoosh.SmooshedWriter channel = v9Smoosher.addWithSmooshedWriter(columnName, ((serdeficator.getSerializedSize()) + (specBytes.size())))) {
        specBytes.writeTo(channel);
        serdeficator.writeTo(channel, v9Smoosher);
    }
}