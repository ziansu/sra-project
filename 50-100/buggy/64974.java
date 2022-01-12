private void compute() {
    mIndexes.clear();
    for (int i = 0; i < ((mElem) - 2); i++) {
        if (((mBuffer[i]) == ((byte) (36))) && ((mBuffer[(i + 1)]) == ((byte) (71)))) {
            mIndexes.add(i);
        }
    }
}