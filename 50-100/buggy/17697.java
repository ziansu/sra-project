static java.util.Set<org.apache.parquet.format.Encoding> fromFormatEncodings(java.util.List<org.apache.parquet.format.Encoding> encodings) {
    java.util.Set<org.apache.parquet.format.Encoding> converted = new java.util.HashSet<org.apache.parquet.format.Encoding>();
    for (org.apache.parquet.format.Encoding encoding : encodings) {
        converted.add(org.apache.parquet.format.converter.ParquetMetadataConverter.getEncoding(encoding));
    }
    converted = java.util.Collections.unmodifiableSet(converted);
    java.util.Set<org.apache.parquet.format.Encoding> cached = org.apache.parquet.format.converter.ParquetMetadataConverter.cachedEncodingSets.putIfAbsent(converted, converted);
    if (cached == null) {
        cached = converted;
    }
    return cached;
}