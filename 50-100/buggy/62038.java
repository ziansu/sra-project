private com.rfo.basic.Var getNewFNVar() {
    com.rfo.basic.Var var = parseVar(com.rfo.basic.Run.Interpreter.USER_FN_OK);
    if ((var != null) && (var.isFunction())) {
        var = searchVar(var);
        if (var.isNew()) {
            return var;
        }else {
            RunTimeError(com.rfo.basic.Run.Interpreter.EXPECT_NEW_FN_NAME);
        }
    }
    LineIndex -= var.name().length();
    return null;
}