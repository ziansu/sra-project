void enterScope(com.google.devtools.build.lib.syntax.BaseFunction function, com.google.devtools.build.lib.syntax.FuncallExpression caller, com.google.devtools.build.lib.syntax.Environment.Frame globals) {
    continuation = new com.google.devtools.build.lib.syntax.Environment.Continuation(continuation, function, caller, lexicalFrame, globalFrame, isSkylark);
    lexicalFrame = new com.google.devtools.build.lib.syntax.Environment.Frame(mutability(), null);
    globalFrame = globals;
    knownGlobalVariables = new java.util.HashSet<>();
    isSkylark = true;
}