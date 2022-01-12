private boolean matchesType(com.nvl.variable.VariableType currentType, java.lang.String currentElement) {
    return (((isString(currentElement, true, currentType)) || (isBoolean(currentElement, true, currentType))) || (isNumber(currentElement))) || (isArray(currentElement));
}