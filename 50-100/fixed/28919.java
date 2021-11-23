private static java.lang.String getArgumentValue(java.lang.String fullArgument) {
    int index = fullArgument.indexOf("=");
    if (index == (-1)) {
        throw new java.lang.IllegalArgumentException((("Argument syntax is wrong." + fullArgument) + ". The right is -arg=value"));
    }
    return fullArgument.substring((index + 1), fullArgument.length());
}