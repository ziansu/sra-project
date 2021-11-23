public int getIndexOfKeyOfEntry(java.lang.String key) {
    if ((key == null) || (key.equals(""))) {
        return -1;
    }
    return getIndexOfKey(key, 0, ((entries.length) - 1));
}