@java.lang.Override
public boolean add(@android.support.annotation.NonNull
com.gmail.collinsmith70.libgdx.key.MappedKey key) {
    int[] loadedAssignments = load(key);
    key.assign(loadedAssignments);
    return super.add(key);
}