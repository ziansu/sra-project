private boolean isPriorityOperation(java.lang.String temp) {
    if (((temp.equals("*")) || (temp.equals("/"))) || (temp.equals("^"))) {
        return true;
    }
    return false;
}