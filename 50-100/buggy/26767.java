private boolean isUnchecked(spoon.reflect.reference.CtTypeReference<?> throwable) {
    java.lang.Class<?> throwableClass = throwable.getActualClass();
    if ((java.lang.RuntimeException.class.isAssignableFrom(throwableClass)) | (java.lang.Error.class.isAssignableFrom(throwableClass))) {
        return true;
    }
    return false;
}