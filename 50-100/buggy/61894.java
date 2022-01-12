public me.enerccio.sp.types.PythonObject executeCall(java.lang.String function, me.enerccio.sp.types.PythonObject... data) {
    if ((currentEnvironment.size()) == 0)
        execute(false, PythonRuntime.runtime.generateGlobals().doGet(function), data);
    
    return execute(false, environment().get(new me.enerccio.sp.types.sequences.StringObject(function), false, false), data);
}