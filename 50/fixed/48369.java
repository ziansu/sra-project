public static void rethrow(java.lang.Throwable t) {
    if (t instanceof java.lang.RuntimeException) {
        throw ((java.lang.RuntimeException) (t));
    }else {
        throw new java.lang.RuntimeException(t);
    }
}