public java.util.List<org.apache.commons.csv.CSVRecord> readFromCSVFile(java.lang.String filePath) throws java.io.IOException {
    java.io.InputStream inputStream = getClass().getResourceAsStream(filePath);
    org.apache.commons.csv.CSVFormat format = CSVFormat.RFC4180.withDelimiter(',').withCommentMarker('#');
    org.apache.commons.csv.CSVParser parser = new org.apache.commons.csv.CSVParser(new java.io.InputStreamReader(inputStream), format);
    java.util.List<org.apache.commons.csv.CSVRecord> csvRecords = parser.getRecords();
    parser.close();
    inputStream.close();
    return csvRecords;
}