private org.exist.xquery.value.BinaryValue extractBinaryEntry(final java.util.zip.ZipInputStream zis) throws org.exist.xquery.XPathException {
    return org.exist.xquery.value.BinaryValueFromInputStream.getInstance(context, new org.exist.xquery.value.Base64BinaryValueType(), zis);
}