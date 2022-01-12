private java.lang.reflect.Method getFinalizeReferentMethod() {
    java.lang.Class<?> finalizableReferenceClass = finalizableReferenceClassReference.get();
    if (finalizableReferenceClass == null) {
        return null;
    }
    try {
        return finalizableReferenceClass.getMethod("finalizeReferent");
    } catch (java.lang.NoSuchMethodException e) {
        throw new java.lang.AssertionError(e);
    }
}