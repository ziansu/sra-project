@org.junit.Test
public void test000() throws java.lang.Exception {
    int n = 18877;
    for (int i = 1; i <= n; i++) {
        java.util.Stack<java.lang.Integer> convertedDigit = Day2.ExcelSpreadsheat.digitalFormat(i);
        java.lang.System.out.println((((convertedDigit.toString()) + "    ") + (Day2.ExcelSpreadsheat.convertToABC(convertedDigit))));
    }
}