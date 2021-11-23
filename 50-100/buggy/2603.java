public static de.ChrisGold.ChrisUtil.math.Rational valueOf(java.lang.String s) {
    if (s.contains("/")) {
        return de.ChrisGold.ChrisUtil.math.Rational.valueOf(java.lang.Double.parseDouble(s));
    }
    java.lang.String[] parts = s.split("/");
    java.math.BigInteger numerator = new java.math.BigInteger(parts[0]);
    java.math.BigInteger denominator = new java.math.BigInteger(parts[1]);
    return de.ChrisGold.ChrisUtil.math.Rational.valueOf(numerator, denominator);
}