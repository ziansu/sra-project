public boolean clear() {
    if ((ArraySize) == 0) {
        return false;
    }else {
        for (int i = ArraySize; i > 0; i--) {
            this.remove(i);
        }
        ArraySize = 0;
        return true;
    }
}