static oop.ex6.main.Variable createParameter(java.lang.String type, java.lang.String name, int lineNumber, boolean isFinal) throws oop.ex6.main.IllegalException {
    oop.ex6.main.Variable.verifyLegalityVariableName(name, lineNumber, new java.util.HashMap<>());
    oop.ex6.main.Variable variable = new oop.ex6.main.Variable(type, name, lineNumber);
    variable.hasValue = true;
    variable.isFinal = isFinal;
    return variable;
}