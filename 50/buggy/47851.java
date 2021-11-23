public boolean isDeleteValid(java.lang.String[] arguments) {
    if ((arguments.length) == 0) {
        return false;
    }
    return Parser.Valid.isInteger(arguments[0]);
}