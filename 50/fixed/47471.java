public int getNextIndex() {
    if ((curIndexBit) > 0) {
        curIndexBit = 0;
        (curIndex)++;
    }
    return curIndex;
}