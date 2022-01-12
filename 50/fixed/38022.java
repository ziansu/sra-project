public synchronized boolean remove(@com.sun.javafx.beans.annotations.NonNull
K key) {
    if (!(cache.containsKey(key))) {
        return false;
    }
    removeNodeFromList(cache.get(key));
    cache.remove(key);
    return true;
}