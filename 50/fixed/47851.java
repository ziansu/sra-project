public boolean isDeleteValid(java.lang.String[] arguments) {
    if ((arguments.length) != 1) {
        return false;
    }else {
        return Parser.Valid.isInteger(arguments[0]);
    }
}