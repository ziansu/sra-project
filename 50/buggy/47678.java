public java.lang.String getDefinition() {
    java.lang.String stringDefReturn = "";
    for (Definition definition : mDefinitions) {
        stringDefReturn += (definition.getDefinition()) + "\n";
    }
    java.lang.System.out.println(stringDefReturn);
    return stringDefReturn;
}