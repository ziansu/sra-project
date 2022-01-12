private JavaFile.Term translateFixedIntegerConstant(java.math.BigInteger constant) {
    long lv = constant.longValue();
    java.lang.Object value;
    if ((lv >= (java.lang.Integer.MIN_VALUE)) && (lv < (java.lang.Integer.MAX_VALUE))) {
        value = ((int) (lv));
    }else {
        value = lv;
    }
    return new wyjc.core.JavaFile.Constant(value);
}