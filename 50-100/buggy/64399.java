private boolean checkKeyChains(java.lang.String key) {
    if (getSharedPreferenceKey("all_lifestyles").contains(key))
        return true;
    
    if (getSharedPreferenceKey("all_reminders").contains(key))
        return true;
    
    if (getSharedPreferenceKey("all_notifications").contains(key))
        return true;
    
    if (getSharedPreferenceKey("all_actions").contains(key))
        return true;
    
    return false;
}