public java.lang.String command(java.lang.String c, long l) {
    debug("command called");
    c = ((java.lang.String.valueOf(l)) + " ") + c;
    java.lang.String result = commandParser.input(c.split(" "));
    return result;
}