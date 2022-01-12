@java.lang.Override
protected void saveHelper(ru.javawebinar.basejava.model.Resume r, int index) {
    int insPoint = (java.lang.Math.abs(index)) - 1;
    java.lang.System.arraycopy(storage, insPoint, storage, (insPoint + 1), ((size) - insPoint));
    storage[insPoint] = r;
    (size)++;
}