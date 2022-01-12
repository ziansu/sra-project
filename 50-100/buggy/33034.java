public static boolean isNullOrEmpty(java.lang.Number number) {
    return (((((number == null) || (number == 0)) || (number == 0.0)) || (number.equals(java.math.BigDecimal.ZERO))) || ((number instanceof java.math.BigDecimal) && ((java.math.BigDecimal.ZERO.compareTo(((java.math.BigDecimal) (number)))) == 0))) || (number.toString().equals("0"));
}