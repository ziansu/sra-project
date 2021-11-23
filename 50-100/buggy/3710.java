static oop.ex6.main.Variable createParameter(java.lang.String type, java.lang.String name, int lineNumber, boolean isFinal, int depth) throws oop.ex6.main.IllegalException {
    oop.ex6.main.Variable.verifyLegalityVariableName(name, lineNumber, depth);
    oop.ex6.main.Variable variable = new oop.ex6.main.Variable(type, name, lineNumber, isFinal);
    variable.hasValue = true;
    return variable;
}