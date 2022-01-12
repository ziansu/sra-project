private void compute() {
    mIndexes.clear();
    for (int i = 0; i < ((mElem) - 2); i++) {
        if ((mBuffer[i]) == ((byte) (36))) {
            mIndexes.add(i);
        }
    }
}