public synchronized void AddRef() {
    if (((mReferenceCounter)++) == 0) {
        mDOMProvider = mFactory.create();
    }
}