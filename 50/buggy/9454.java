private void addFirstColumn(java.lang.String value) throws java.io.IOException {
    csvStream.write(",".getBytes(UTF8));
    addColumn(value);
}