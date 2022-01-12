public java.lang.Boolean matches(java.lang.String check) {
    if (phrases.contains(check.toLowerCase())) {
        return true;
    }
    return false;
}