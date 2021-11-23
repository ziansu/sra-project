public boolean deletePairByFirst(java.util.HashSet<java.lang.String> _first) {
    if (_first == null)
        return false;
    
    for (java.util.Map.Entry<java.util.HashSet<java.lang.String>, java.util.HashSet<java.lang.String>> entry : mapContent.entrySet())
        if (entry.getKey().equals(_first))
            return (mapContent.remove(entry.getKey())) != null;
        
    
    return false;
}