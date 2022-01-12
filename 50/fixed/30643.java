public boolean setLPToAdd(short toAdd) {
    if (((LP) + toAdd) < 0) {
        legit = false;
        return false;
    }else {
        amount = toAdd;
        legit = true;
        return true;
    }
}