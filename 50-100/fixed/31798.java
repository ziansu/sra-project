private int getListArg(java.lang.String errorMsg) {
    if (evalNumericExpression()) {
        int listIndex = EvalNumericExpressionValue.intValue();
        if ((listIndex > 0) && (listIndex < (com.rfo.basic.Run.theLists.size()))) {
            return listIndex;
        }
        RunTimeError(errorMsg);
    }
    return -1;
}