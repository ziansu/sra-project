public boolean ackIsDuplicate(int acknum) {
    if (acknum == (dupACKNum)) {
        return true;
    }else {
        return false;
    }
}