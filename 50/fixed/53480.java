public static <T extends java.lang.Throwable> void rethrow(java.lang.Throwable throwable, java.lang.Class<T> type) throws T {
    if (type.isInstance(throwable)) {
        throw type.cast(throwable);
    }
}