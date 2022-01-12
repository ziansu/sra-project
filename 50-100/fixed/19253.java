public java.util.TreeMap<java.lang.Integer, java.lang.String> validateGroups(java.util.TreeMap<java.lang.Integer, java.lang.String> groups) {
    java.util.ArrayList<java.lang.Integer> toRemove = new java.util.ArrayList<java.lang.Integer>();
    for (int key : groups.keySet()) {
        if (groups.get(key).matches("(\\(\\?([=:]|[=!<][=!])[^\\)]+\\))")) {
            toRemove.add(key);
        }
    }
    for (int key : toRemove) {
        if (key != 0)
            groups.remove(key);
        
    }
    return groups;
}