private boolean addToKeychain(java.lang.String keyChain, java.lang.String key) {
    java.lang.String all_keys = getSharedPreferenceKey(keyChain);
    if (all_keys == null)
        return false;
    
    if (all_keys.contains(key))
        return false;
    
    if (all_keys != "")
        all_keys += "," + key;
    else
        all_keys = key;
    
    sharedPreferencePutString(keyChain, all_keys);
    return true;
}