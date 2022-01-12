public static <T> java.lang.Boolean testThrowingUnchecked(net.sf.jabb.util.ex.ExceptionUncheckUtility.PredicateThrowsExceptions<T> function, T t) {
    try {
        return function.test(t);
    } catch (java.lang.Exception exception) {
        net.sf.jabb.util.ex.ExceptionUncheckUtility.throwAsUnchecked(exception);
        return false;
    }
}