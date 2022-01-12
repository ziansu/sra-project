public java.lang.String executeFunction(java.lang.String name, java.util.List<jask.Variable> heap) {
    if (!(functions.containsKey(name))) {
        java.lang.Error.printErrorFunctionNotDefined(name);
        return "NULL";
    }
    jask.Function function = functions.get(name);
    function.setHeap(heap);
    jask.Interpreter interpreter = new jask.Interpreter(function, this);
    return interpreter.interpret(function.getTokens());
}