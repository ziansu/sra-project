private wyil.util.interpreter.Interpreter.Status executeAllWithin(wyil.util.interpreter.Constant[] frame, wyil.util.interpreter.Interpreter.Context context) {
    while (context.hasNext()) {
        wyil.util.interpreter.Interpreter.Status r = execute(context.getStatement(), frame, context);
        if (r != (wyil.util.interpreter.Interpreter.Status.NEXT)) {
            return r;
        }
        context.nextStatement();
    } 
    return wyil.util.interpreter.Interpreter.Status.NEXT;
}