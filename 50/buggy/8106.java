public boolean isSet(java.lang.String id) {
    if ((currentLevel) < 0)
        return false;
    
    return levels.get(currentLevel).containsKey(id);
}