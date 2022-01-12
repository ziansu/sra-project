public org.apache.flink.api.java.DataSet<org.apache.flink.api.java.tuple.Tuple2<java.lang.Integer, java.lang.String>> getDataCleanerTestDataFromCsv() {
    java.io.File testData = new java.io.File(classLoader.getResource("iss4DataCleanerTestData.csv").getFile());
    return environment.readCsvFile(testData.toString()).includeFields("11").fieldDelimiter(";").types(java.lang.Integer.class, java.lang.String.class);
}