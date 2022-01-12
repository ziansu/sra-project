private void initThrowable(final java.lang.Object[] params, final int argCount, final int usedParams) {
    if (((usedParams < argCount) && ((this.throwable) == null)) && ((params[(argCount - 1)]) instanceof java.lang.Throwable)) {
        this.throwable = ((java.lang.Throwable) (params[(argCount - 1)]));
    }
}