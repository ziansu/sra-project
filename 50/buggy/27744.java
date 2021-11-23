public boolean isLocked() {
    if ((getCheckedOut()) == null) {
        return false;
    }else {
        return true;
    }
}