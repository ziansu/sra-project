private boolean parseSimpleDefinition() {
    if (!(variableManager.containsVariable(splitString.getNthElement(0)))) {
        return isValidRightSide(splitString.getNthElement(2));
    }else {
        com.nvl.variable.VariableType type = variableManager.getVariable(splitString.getNthElement(0)).getType();
        return matchesType(type, splitString.getNthElement(2));
    }
}