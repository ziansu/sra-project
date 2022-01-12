@java.lang.Override
public boolean retainAll(com.hopkins.collections.Collection<?> items) {
    boolean hasChanged = false;
    for (int i = (size) - 1; i >= 0; i--) {
        if (!(items.contains(data[i]))) {
            remove(i);
            hasChanged = true;
        }
    }
    return hasChanged;
}