public synchronized long userToDatabase(java.lang.String value, int units) throws java.text.ParseException {
    if (value == null) {
        return 0;
    }
    try {
        de.onyxbits.jbee.Evaluator e = new de.onyxbits.jbee.Evaluator();
        java.math.BigDecimal val = e.evaluateOrThrow(value);
        if (units != 0) {
            val = val.divide(new java.math.BigDecimal(units));
        }
        return val.multiply(new java.math.BigDecimal(FACTOR)).longValue();
    } catch (java.lang.Exception e) {
        throw new java.text.ParseException(value, 0);
    }
}