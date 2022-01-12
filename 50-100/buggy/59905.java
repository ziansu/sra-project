public static void main(java.lang.String[] args) {
    com.sardina.ReversePolishCalc rpc = new com.sardina.ReversePolishCalc();
    java.lang.String rpnExpression = "2.5,4.8,+";
    double expectedResult = 7.3;
    double actualResult = rpc.calculate(rpnExpression);
    java.lang.System.out.println(" ");
    java.lang.System.out.println("%%%%%% MAIN PAGE BELOW %%%%%");
    com.sardina.Main.checkResult(rpnExpression, expectedResult, actualResult);
}