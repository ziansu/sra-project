public boolean isFloating() {
    if ((!(isDeadline())) && (!(isEvent()))) {
        return true;
    }
    return false;
}