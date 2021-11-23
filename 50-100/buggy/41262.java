@java.lang.Override
public boolean containsAll(java.util.Collection<?> c) {
    java.lang.Object[] arr = c.toArray();
    for (int i = 0; i < (arr.length); i++) {
        if (!(contains(((E) (arr[i]))))) {
            return false;
        }
    }
    return true;
}