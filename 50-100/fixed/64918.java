public void writeDataPageHeader(int uncompressedSize, int compressedSize, int valueCount, org.apache.parquet.format.Statistics statistics, org.apache.parquet.format.Encoding rlEncoding, org.apache.parquet.format.Encoding dlEncoding, org.apache.parquet.format.Encoding valuesEncoding, java.io.OutputStream to) throws java.io.IOException {
    org.apache.parquet.format.Util.writePageHeader(newDataPageHeader(uncompressedSize, compressedSize, valueCount, statistics, rlEncoding, dlEncoding, valuesEncoding), to);
}