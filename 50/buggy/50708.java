@me.enerccio.sp.types.pointer.WrapAnnotationFactory.WrapMethod
public void signal(me.enerccio.sp.types.callables.CallableObject o, me.enerccio.sp.types.sequences.TupleObject args, me.enerccio.sp.interpret.InternalDict dict) {
    me.enerccio.sp.interpret.PythonInterpreter i = PythonInterpreter.interpreterMap.get(t);
    PythonInterpreter.interpreter.get().interruptInterpret(i, o, args, dict.asKwargs());
}