public boolean checkBitmask(byte[] bitmask) {
    if ((bitmask.length) == (otsAlgo.getLength())) {
        return true;
    }else {
        return false;
    }
}