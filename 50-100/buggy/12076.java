public static me.enerccio.sp.types.PythonObject getGlobal(java.lang.String variable) {
    if ((PythonInterpreter.interpreter.get().currentFrame.size()) == 0)
        return PythonRuntime.runtime.getGlobals().doGet(variable);
    
    return PythonInterpreter.interpreter.get().environment().get(variable, true, false);
}