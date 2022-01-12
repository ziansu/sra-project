private void addClickedNumber(int val) {
    if (((mInputPointer) < ((mInputSize) - 1)) && (!(((mInputPointer) == (-1)) && (val == 0)))) {
        for (int i = mInputPointer; i >= 0; i--) {
            mInput[(i + 1)] = mInput[i];
        }
        (mInputPointer)++;
        mInput[0] = val;
    }
}