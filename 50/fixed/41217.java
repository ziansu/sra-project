private boolean isPriorityOperation(java.lang.String temp) {
    return ((temp.equals("*")) || (temp.equals("/"))) || (temp.equals("^"));
}