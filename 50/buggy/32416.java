@java.lang.Override
public boolean add(@android.support.annotation.NonNull
com.gmail.collinsmith70.libgdx.key.MappedKey key) {
    int[] loadedAssignments = load(key);
    if ((loadedAssignments.length) == 0) {
        return super.add(key);
    }
    key.assign(loadedAssignments);
    return true;
}