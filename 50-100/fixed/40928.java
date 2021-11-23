public void changed() {
    int key;
    final int size = mDependentsById.size();
    for (int i = 0; i < size; i++) {
        key = mDependentsById.keyAt(i);
        mDependentsById.get(key).invalidate();
    }
}