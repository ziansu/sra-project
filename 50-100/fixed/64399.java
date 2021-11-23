private boolean checkKeyChains(java.lang.String key) {
    if (contains(getSharedPreferenceKey("all_lifestyles"), key))
        return true;
    
    if (contains(getSharedPreferenceKey("all_reminders"), key))
        return true;
    
    if (contains(getSharedPreferenceKey("all_notifications"), key))
        return true;
    
    if (contains(getSharedPreferenceKey("all_actions"), key))
        return true;
    
    return false;
}