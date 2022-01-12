private static <T> void assertErrorOnInvokeOptional(okhttp3.internal.platform.OptionalMethod<T> optionalMethod, T base, java.lang.Object... args) throws java.lang.Exception {
    try {
        optionalMethod.invokeOptional(base, args);
        org.junit.Assert.fail();
    } catch (java.lang.Error expected) {
    }
}