int getParallelism() {
    com.google.common.base.Preconditions.checkArgument(((null == (parallelism)) || ((parallelism) > 0)), "invalid parallelism %s; must be greater than zero");
    java.lang.Integer value = parallelism;
    if (null == value) {
        value = java.lang.Runtime.getRuntime().availableProcessors();
    }
    return value;
}