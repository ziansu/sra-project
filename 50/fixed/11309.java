public void incrementKey(int key) {
    int temp = keys.get(key);
    temp++;
    keys.set(key, temp);
}