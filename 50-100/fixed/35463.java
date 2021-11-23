private boolean _isValid(int i, int j) {
    if ((((i > 0) && (j > 0)) && (i <= (_gridWidth))) && (j <= (_gridWidth))) {
        return true;
    }else {
        return false;
    }
}