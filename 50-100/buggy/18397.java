@Test
void writeCsvFile() {
    utils.CsvFileWriter test = new utils.CsvFileWriter();
    utils.CsvFileReader testR = new utils.CsvFileReader();
    java.lang.String file = "resTest/testFile.csv";
    test.writeCsvFile(employees);
    testC.loadCompanyFromFile(file);
    assertEquals(employees.size(), testC.getAllEmployee().size());
}