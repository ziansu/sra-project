public com.blazingkin.interpreter.variables.Value run(com.blazingkin.interpreter.variables.Value v) {
    com.blazingkin.interpreter.executor.Executor.setReturnBuffer(v);
    com.blazingkin.interpreter.variables.Value elem = com.blazingkin.interpreter.executor.executionstack.RuntimeStack.pop();
    com.blazingkin.interpreter.executor.Executor.setBreakMode(true);
    while ((elem == null) || ((elem.type) != (com.blazingkin.interpreter.variables.VariableTypes.Method))) {
        elem = com.blazingkin.interpreter.executor.executionstack.RuntimeStack.pop();
    } 
    return v;
}