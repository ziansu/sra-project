private void addArgToList(java.lang.String arg, boolean isLast) {
    if (!isLast) {
        argList += arg + "; ";
    }else {
        argList += arg;
    }
}