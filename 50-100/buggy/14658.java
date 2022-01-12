private static java.util.List<org.apache.parquet.format.Encoding> toFormatEncodings(java.util.Set<org.apache.parquet.format.Encoding> encodings) {
    java.util.List<org.apache.parquet.format.Encoding> converted = new java.util.ArrayList<org.apache.parquet.format.Encoding>(encodings.size());
    for (org.apache.parquet.format.Encoding encoding : encodings) {
        converted.add(org.apache.parquet.format.converter.ParquetMetadataConverter.getEncoding(encoding));
    }
    return converted;
}