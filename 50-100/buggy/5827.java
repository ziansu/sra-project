public static void greaterThan(java.lang.String message, double lhs, double rhs, double margin) {
    com.johnuckele.vtest.Tester.checkScope();
    java.lang.System.out.println(((((((("\t\t" + message) + ": ") + lhs) + " > ") + rhs) + " ± ") + margin));
    double difference = lhs - rhs;
    com.johnuckele.vtest.Tester.test((lhs > (rhs - (java.lang.Math.abs(difference)))));
}