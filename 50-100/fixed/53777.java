public io.cloudslang.runtime.api.python.PythonExecutionResult exec(java.lang.String script, java.util.Map<java.lang.String, java.io.Serializable> callArguments) {
    checkValidInterpreter();
    try {
        initInterpreter();
        prepareInterpreterContext(callArguments);
        return exec(script);
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(("Error executing python script: " + e), e);
    }
}