private void addClickedNumber(int val) {
    if ((mInputPointer) < ((mInputSize) - 1)) {
        for (int i = mInputPointer; i >= 0; i--) {
            mInput[(i + 1)] = mInput[i];
        }
        (mInputPointer)++;
        mInput[0] = val;
    }
}