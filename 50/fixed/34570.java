public static <T> T handleExceptionAndReturn(org.slf4j.Logger log, java.lang.Exception e, java.lang.String method, java.util.function.Supplier<T> returnSupplier, java.lang.Object... params) {
    kr.jm.utils.exception.JMExceptionManager.logException(log, e, method, params);
    return returnSupplier.get();
}