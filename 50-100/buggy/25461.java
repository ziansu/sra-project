public static void testIsContinuous(java.lang.String[] args) {
    Parser P = new Parser(args[0]);
    Function func = new Function(args[0], P.root, P.argList);
    func.print();
    java.lang.Double val = java.lang.Double.parseDouble(args[1]);
    try {
        java.lang.System.out.println(((("isContinuous(" + val) + ") = ") + (func.isContinuous(val))));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}