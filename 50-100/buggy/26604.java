public boolean inBounds(java.util.Vector key) {
    if ((_lowerLimit) == null) {
        return true;
    }
    if (((compareKey(key, _lowerLimit)) < 0) || ((compareKey(key, _upperLimit)) > 0)) {
        return false;
    }
    return true;
}