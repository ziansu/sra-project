private boolean contains() {
    for (java.lang.String string : patterns) {
        if (!(input.toLowerCase().contains(string.toLowerCase()))) {
            return true;
        }
    }
    return false;
}