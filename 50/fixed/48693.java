public static void clearVariables() {
    for (com.blazingkin.interpreter.variables.Context c : Context.contexts) {
        c.variables.clear();
    }
    com.blazingkin.interpreter.variables.Variable.globalContext = new com.blazingkin.interpreter.variables.Context();
}