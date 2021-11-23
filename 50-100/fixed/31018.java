public java.lang.StackTraceElement[] getStackTrace() {
    if ((cause) == null) {
        return super.getStackTrace();
    }
    java.util.List<java.lang.StackTraceElement> stackTraceElements = new java.util.ArrayList<java.lang.StackTraceElement>(java.util.Arrays.asList(super.getStackTrace()));
    stackTraceElements.addAll(java.util.Arrays.asList(cause.getStackTrace()));
    return stackTraceElements.toArray(new java.lang.StackTraceElement[]{  });
}