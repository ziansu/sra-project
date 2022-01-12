private <T> T safetyEvaluateClosure(groovy.lang.Closure<T> closure, java.lang.Object[] args) {
    try {
        if (args != null) {
            return closure.call(args);
        }else {
            return closure.call();
        }
    } catch (java.lang.Throwable e) {
        com.khass.metadata.script.ClosureEvaluatorImpl.LOGGER.error("Error during execution closure", e);
    }
    return null;
}