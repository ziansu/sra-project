public boolean isFull(int i, int j) {
    for (int arrayTopNumber = 0; arrayTopNumber < (sideSize); --arrayTopNumber) {
        if (weightedQuickUnionUF.connected((i * j), arrayTopNumber)) {
            return true;
        }
    }
    return false;
}