@java.lang.Override
public java.lang.Object apply(java.lang.Object oldValue, com.parse4cn1.ParseObject parseObject, java.lang.String key) throws com.parse4cn1.ParseException {
    if (oldValue == null) {
        return amount;
    }
    if (com.parse4cn1.operation.ParseOperationUtil.isSupportedNumberType(oldValue)) {
        return com.parse4cn1.operation.ParseOperationUtil.addNumbers(oldValue, this.amount);
    }
    throw new java.lang.IllegalArgumentException(((("You cannot increment a non-number." + " Key type [") + (oldValue.getClass().toString())) + "]"));
}