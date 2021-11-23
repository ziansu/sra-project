private int getIndexArg(int max) {
    int index = 1;
    if (isNext(',')) {
        if (!(evalNumericExpression()))
            return 0;
        
        index = EvalNumericExpressionValue.intValue();
        if ((index < 1) || (index > max)) {
            RunTimeError((("Index (" + index) + ") out of range"));
            return 0;
        }
    }
    return index;
}