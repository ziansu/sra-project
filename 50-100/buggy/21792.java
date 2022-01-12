public java.lang.String parseEquation(java.lang.String equationString, java.lang.String variables) {
    java.lang.String editedEquationString;
    if (((checkForValidCharacters(equationString, variables)) && (checkForIllegalSequences(equationString))) && (checkForBalancedDelimiters(equationString))) {
        editedEquationString = insertMultiplicationSymbol(equationString);
        editedEquationString = convertToPostfix(editedEquationString);
    }
    return editedEquationString;
}