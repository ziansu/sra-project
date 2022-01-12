public static java.lang.Boolean isPositive(java.lang.String value) {
    if (value == null) {
        return false;
    }
    return (((((value.equals("true")) || (value.equals("TRUE"))) || (value.equals("yes"))) || (value.equals("YES"))) || (value.equals("enabled"))) || (value.equals("ENABLED"));
}