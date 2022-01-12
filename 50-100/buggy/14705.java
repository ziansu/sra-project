public java.util.List<java.lang.Integer> parseIntegerList(java.lang.String numberStr, java.lang.String separator) throws java.lang.NumberFormatException {
    java.util.List<java.lang.Integer> argumentList = new java.util.LinkedList<java.lang.Integer>();
    if (numberStr.isEmpty()) {
        return argumentList;
    }else {
        java.lang.String[] arguments = numberStr.split(separator);
        for (int i = 0; i < (arguments.length); i++) {
            int argument = java.lang.Integer.parseInt(arguments[0]);
            argumentList.add(argument);
        }
    }
    return argumentList;
}