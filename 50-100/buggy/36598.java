@java.lang.Override
public com.evolved.automata.lisp.Value evaluate(com.evolved.automata.lisp.Environment env, com.evolved.automata.lisp.Value[] evaluatedArgs) {
    checkActualArguments(1, false, false);
    if ((evaluatedArgs.length) > 0) {
        if ((evaluatedArgs.length) > 1)
            insertTextOnMainThread(((evaluatedArgs[0].toString()) + "\n"));
        else
            insertTextOnMainThread(evaluatedArgs[0].toString());
        
    }
    return com.evolved.automata.lisp.Environment.getNull();
}