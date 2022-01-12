@java.lang.Override
public boolean hasNext() {
    while (!(mRhsIterator.hasNext())) {
        nextLhs();
    } 
    return mRhsIterator.hasNext();
}