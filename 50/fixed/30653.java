public boolean lockMap(java.lang.String key) {
    _lock_map.lock(key);
    return true;
}