@java.lang.Override
protected V processArg(A parameter) {
    V tableValue = table.evaluate().get(parameter);
    return tableValue;
}