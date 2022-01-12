public boolean isEmpty(java.lang.String str) {
    if (str == null) {
        return true;
    }
    if ((str.length()) == 0) {
        return true;
    }
    if ((str.replaceAll(" ", "").length()) == 0) {
        return true;
    }
    return false;
}