public java.lang.String[][] build() {
    int numUniqueElements = attachedElements.length;
    java.lang.String[][] chemFormula = new java.lang.String[2][numUniqueElements];
    for (int i = 0; i < numUniqueElements; i++) {
        chemFormula[0][i] = attachedElements[i].getChemSymbol();
        chemFormula[1][i] = java.lang.Integer.toString(coefficients[i]);
    }
}