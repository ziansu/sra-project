@java.lang.Override
public com.evolved.automata.lisp.Value evaluate(com.evolved.automata.lisp.Environment env, com.evolved.automata.lisp.Value[] evaluatedArgs) {
    java.lang.String fileName = evaluatedArgs[0].getString();
    try {
        java.lang.String[] lines = com.evolved.automata.filetools.StandardTools.getDataFileLines(fileName);
        return env.getRootEnvironment().loadFromFileLines(lines);
    } catch (java.io.IOException ie) {
        throw new java.lang.RuntimeException(ie);
    }
}