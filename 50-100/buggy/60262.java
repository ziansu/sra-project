@java.lang.Override
protected boolean perform(java.lang.String[] args) {
    try {
        tokens.add(new assembler.arc8051.DirectiveTokens.OriginChangeToken(java.lang.Long.parseLong(args[0]), line));
    } catch (java.lang.NumberFormatException e) {
        problems.add(new assembler.util.problems.TokenizingProblem("Illegal number format!", Problem.Type.ERROR, file, line, args[1]));
        return false;
    }
    return true;
}