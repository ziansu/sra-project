public void bind() {
    synchronized(me.enerccio.sp.interpret.PythonInterpreter.interpreter) {
        me.enerccio.sp.interpret.PythonInterpreter.interpreterMap.remove(currentOwnerThread);
        me.enerccio.sp.interpret.PythonInterpreter.interpreter.set(this);
        me.enerccio.sp.interpret.PythonInterpreter.interpreterMap.put(currentOwnerThread, this);
    }
}