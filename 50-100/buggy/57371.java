private void readAndRightDigits(java.lang.String digitsToRead) {
    for (int i = java.lang.Math.min(((digitsToRead.length()) - 1), mInputSize); i >= 0; i--) {
        (mInputPointer)++;
        mInput[mInputPointer] = (digitsToRead.charAt(i)) - '0';
    }
}