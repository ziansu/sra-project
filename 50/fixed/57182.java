public boolean checkInside(int pos) {
    if ((pos <= (((start) + (length)) - 1)) && (pos >= (start))) {
        return true;
    }else {
        return false;
    }
}