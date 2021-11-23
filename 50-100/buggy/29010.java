public boolean fetchDir(java.util.List<java.lang.String> command) {
    boolean sortDir;
    int idx = (command.indexOf("ORDERBY")) + 2;
    java.lang.String direction = command.get(idx);
    if (direction.contains(";")) {
        java.lang.String[] s = direction.split(";");
        direction = s[0];
    }
    if (direction.equalsIgnoreCase("DESC")) {
        sortDir = false;
    }else {
        sortDir = true;
    }
    return sortDir;
}