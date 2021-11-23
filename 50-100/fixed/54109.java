private boolean castNeeded() {
    if (needsCast) {
        return true;
    }
    if ((((field) == null) || ((value) == null)) || ((type) == null)) {
        return false;
    }
    return !(type.equals(field.getType()));
}