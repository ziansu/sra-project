private org.exist.xquery.value.BinaryValue extractBinaryEntry(java.util.zip.ZipInputStream zis, java.util.zip.ZipEntry zipEntry) throws org.exist.xquery.XPathException {
    return org.exist.xquery.value.BinaryValueFromInputStream.getInstance(context, new org.exist.xquery.value.Base64BinaryValueType(), zis);
}