protected boolean codecAcceptsHugeBinaryValues(java.lang.String field) {
    java.lang.String name = org.apache.lucene.util.TestUtil.getDocValuesFormat(field);
    return !(name.equals("Memory"));
}