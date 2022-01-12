private int getStackIndexArg() {
    if (evalNumericExpression()) {
        int stackIndex = EvalNumericExpressionValue.intValue();
        if ((stackIndex > 0) && (stackIndex < (com.rfo.basic.Run.theStacks.size()))) {
            return stackIndex;
        }
        RunTimeError("Invalid Stack Pointer");
    }
    return 0;
}