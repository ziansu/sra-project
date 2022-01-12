public static com.pantor.blink.FixedDec._1 valueOf(java.lang.String s) {
    java.math.BigDecimal bd = new java.math.BigDecimal(s);
    bd = bd.setScale(1);
    return new com.pantor.blink.FixedDec._1(bd.unscaledValue().longValue());
}