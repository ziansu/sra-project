public java.lang.String calculate(java.util.ArrayList<java.lang.String> strInput) {
    java.util.List<com.example.xin.calculatorsimple.Element> test = new com.example.xin.calculatorsimple.InputExpressionParser().parse(strInput);
    java.lang.System.out.println(test);
    com.example.xin.calculatorsimple.InfixPostfixConverter ipc = new com.example.xin.calculatorsimple.InfixPostfixConverter(test);
    com.example.xin.calculatorsimple.PostfixCalculator calculator = new com.example.xin.calculatorsimple.PostfixCalculator();
    java.lang.System.out.println("compute 4");
    java.util.List<com.example.xin.calculatorsimple.Element> test2 = ipc.getPostfixExpression();
    java.lang.System.out.println(test2);
    java.lang.String res = calculator.evaluate(test2);
    java.lang.System.out.println(res);
    java.lang.System.out.println("compute 5");
    return res;
}