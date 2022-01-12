public boolean unlockMap(java.lang.String key) {
    if ((_lock_map.get(key)) == "true") {
        _lock_map.unlock(key);
        _lock_map.replace(key, "false");
    }
    return true;
}