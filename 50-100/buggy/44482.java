private void findVariables(java.lang.String equation) {
    EquationParser.variables = new java.util.ArrayList<java.lang.Character>();
    for (char c : equation.toCharArray()) {
        if (java.lang.Character.isLetter(c)) {
            EquationParser.variables.add(c);
        }
    }
}