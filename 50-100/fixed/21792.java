public java.lang.String parseEquation(java.lang.String equationString, java.lang.String variables) {
    java.lang.String editedEquationString = null;
    if (((checkForValidCharacters(equationString, variables)) && (checkForIllegalSequences(equationString))) && (checkForBalancedDelimiters(equationString))) {
        editedEquationString = insertMultiplicationSymbol(equationString);
        java.lang.System.out.println(editedEquationString);
        editedEquationString = convertToPostfix(editedEquationString);
    }
    return editedEquationString;
}