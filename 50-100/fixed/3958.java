private static <T> void assertErrorOnInvokeOptional(okhttp3.internal.platform.OptionalMethod<T> optionalMethod, T base, java.lang.Object... args) throws java.lang.Exception {
    try {
        optionalMethod.invokeOptional(base, args);
    } catch (java.lang.Error expected) {
        return ;
    }
    org.junit.Assert.fail();
}