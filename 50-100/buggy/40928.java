public void changed() {
    int key;
    for (int i = 0; i < (mDependentsById.size()); i++) {
        key = mDependentsById.keyAt(i);
        mDependentsById.get(key).invalidate();
    }
}