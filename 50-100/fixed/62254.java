public void writeDictionaryPageHeader(int uncompressedSize, int compressedSize, int valueCount, org.apache.parquet.format.Encoding valuesEncoding, java.io.OutputStream to) throws java.io.IOException {
    org.apache.parquet.format.PageHeader pageHeader = new org.apache.parquet.format.PageHeader(org.apache.parquet.format.PageType.DICTIONARY_PAGE, uncompressedSize, compressedSize);
    pageHeader.setDictionary_page_header(new org.apache.parquet.format.DictionaryPageHeader(valueCount, getEncoding(valuesEncoding)));
    org.apache.parquet.format.Util.writePageHeader(pageHeader, to);
}