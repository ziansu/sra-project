public java.lang.String individualizedMessage(android.content.Context c) {
    groupMessage.buildArrayListFromString();
    if ((groupMessage.variables.size()) > 0) {
        return replaceNameVariables(groupMessage.messageBody, groupMessage.variables, c);
    }
    return groupMessage.messageBody;
}