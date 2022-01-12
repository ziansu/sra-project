private void containInSameScope(java.lang.String name, int depth, int lineNumber) throws oop.ex6.main.IllegalException {
    if (oop.ex6.main.Parser.variables.get(depth).containsKey(name)) {
        throw new oop.ex6.main.IllegalException(oop.ex6.main.Parser.ALREADY_TOKEN_ERROR_MESSAGE, lineNumber);
    }
}