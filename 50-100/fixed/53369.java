private static int getConditionNumber(boolean left, boolean self, boolean right) {
    int leftBit = (left) ? 1 : 0;
    int selfBit = (self) ? 1 : 0;
    int rightBit = (right) ? 1 : 0;
    return ((leftBit * 4) + (selfBit * 2)) + rightBit;
}