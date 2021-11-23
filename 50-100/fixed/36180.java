public boolean isPrimitive(java.lang.Object o) {
    java.lang.Class<?> cls = o.getClass();
    return ((randoop.operation.NonreceiverTerm.isNonreceiverType(cls)) || (cls.equals(java.math.BigInteger.class))) || (cls.equals(java.math.BigDecimal.class));
}