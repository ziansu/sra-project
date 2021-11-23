public com.eclipsesource.v8.V8Object executeObjectScript(final java.lang.String script, final java.lang.String scriptName, final int lineNumber) {
    checkThread();
    java.lang.Object result = this.executeScript(script, null, 0);
    if (result instanceof com.eclipsesource.v8.V8Object) {
        return ((com.eclipsesource.v8.V8Object) (result));
    }
    throw new com.eclipsesource.v8.V8ResultUndefined();
}