public boolean isFloating() {
    if ((isDeadline()) || (isEvent())) {
        return true;
    }else {
        return false;
    }
}