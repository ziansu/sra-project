private boolean targettingSelf(java.lang.String target) {
    return (((target == null) || ((target.length()) == 0)) || (target.equalsIgnoreCase("me"))) || (target.equalsIgnoreCase("self"));
}