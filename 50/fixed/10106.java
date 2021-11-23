@java.lang.Override
public boolean hasNext() {
    while (!(mRhsIterator.hasNext())) {
        if (!(nextLhs())) {
            return false;
        }
    } 
    return mRhsIterator.hasNext();
}