protected java.math.BigDecimal xor(java.math.BigDecimal[] values) {
    if ((values.length) != 2) {
        throw new java.lang.IllegalArgumentException((("Exclusive or expects only two values, but found " + (values.length)) + ".  Unable to continue."));
    }
    return values[0].equals(values[1]) ? java.math.BigDecimal.ZERO : java.math.BigDecimal.ONE;
}