public boolean isDeadline() {
    if ("".equals(date)) {
        return false;
    }
    return true;
}