public static com.pantor.blink.FixedDec._4 valueOf(java.lang.String s) {
    java.math.BigDecimal bd = new java.math.BigDecimal(s);
    bd.setScale(4);
    return new com.pantor.blink.FixedDec._4(bd.unscaledValue().longValue());
}