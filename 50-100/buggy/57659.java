public static void lessOrEqual(java.lang.String message, float lhs, float rhs, float margin) {
    com.johnuckele.vtest.Tester.checkScope();
    java.lang.System.out.println(((((((("\t\t" + message) + ": ") + lhs) + " <= ") + rhs) + " ± ") + margin));
    double difference = lhs - rhs;
    com.johnuckele.vtest.Tester.test((lhs <= (rhs - (java.lang.Math.abs(difference)))));
}