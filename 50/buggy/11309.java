public void incrementKey(int key) {
    int temp = keys.get(key);
    keys.set(key, (temp++));
}