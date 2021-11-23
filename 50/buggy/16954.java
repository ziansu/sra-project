public java.lang.String individualizedMessage() {
    groupMessage.buildArrayListFromString();
    if ((groupMessage.variables.size()) > 0) {
        return replaceNameVariables(groupMessage.messageBody, groupMessage.variables);
    }
    return groupMessage.messageBody;
}