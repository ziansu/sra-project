private <T> java.util.Optional<T> safetyEvaluateClosure(groovy.lang.Closure<T> closure, java.lang.Object... args) {
    try {
        if (args != null) {
            return java.util.Optional.of(closure.call(args));
        }else {
            return java.util.Optional.of(closure.call());
        }
    } catch (java.lang.Throwable e) {
        com.khass.metadata.script.ClosureEvaluatorImpl.LOGGER.error("Error during execution closure", e);
    }
    return java.util.Optional.empty();
}