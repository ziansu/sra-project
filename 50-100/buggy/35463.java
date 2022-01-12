private boolean _isValid(int x, int y) {
    if ((((x > 0) && (y > 0)) && (x <= (_gridWidth))) && (y <= (_gridWidth))) {
        return true;
    }else {
        return false;
    }
}