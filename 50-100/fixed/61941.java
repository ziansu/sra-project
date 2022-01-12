private java.util.ArrayList<java.lang.String> extractArrayContentsFromArray(final java.lang.String value, final java.lang.String propertyName) throws java.io.IOException {
    final au.com.bytecode.opencsv.CSVParser arrayParser = new au.com.bytecode.opencsv.CSVParser(org.structr.rest.servlet.CsvServlet.DEFAULT_FIELD_SEPARATOR_COLLECTION_CONTENTS, org.structr.rest.servlet.CsvServlet.DEFAULT_QUOTE_CHARACTER_COLLECTION_CONTENTS);
    final java.util.ArrayList<java.lang.String> extractedStrings = new java.util.ArrayList();
    extractedStrings.addAll(java.util.Arrays.asList(arrayParser.parseLine(stripArrayBracketsFromString(value, propertyName))));
    return extractedStrings;
}