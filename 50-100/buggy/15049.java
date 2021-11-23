@org.testng.annotations.DataProvider(name = "CalendarLabels")
public static java.lang.String[] links() {
    com.athena.automation.framework.tooling.ReadExcel read = new com.athena.automation.framework.tooling.ReadExcel();
    java.lang.String[] input = new java.lang.String[2];
    for (int i = 0; i < (input.length); i++) {
        input[i] = read.readXLSXFile("C:/Users/asuganyasree/Desktop/Book1.xlsx", "Sheet1", "Time Period", (i + 1));
        input[i] = input[i].trim();
    }
    return input;
}