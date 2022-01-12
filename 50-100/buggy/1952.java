public static boolean isEqual(java.lang.String eq) {
    int test = 1;
    int equalsIndex = eq.indexOf("=");
    java.lang.String lhs = eq.substring(0, equalsIndex);
    java.lang.String rhs = eq.substring((equalsIndex + 1));
    double side1 = MathString.notateToDouble(MathString.pemdas(lhs));
    double side2 = MathString.notateToDouble(MathString.pemdas(rhs));
    return side1 == side2;
}