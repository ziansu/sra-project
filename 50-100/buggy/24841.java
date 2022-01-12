@java.lang.Override
protected void insertResume(com.urise.webapp.model.Resume r, int index) {
    int insertIndex = (-index) - 1;
    java.lang.System.arraycopy(storage, insertIndex, storage, (insertIndex + 1), (((size) + 1) - insertIndex));
    storage[insertIndex] = r;
}