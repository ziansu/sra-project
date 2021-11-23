public boolean checkRobots(java.lang.String location, java.lang.String host) {
    java.util.ArrayList<java.lang.String> ruleList = disallowedLists.get(host);
    if (ruleList == null)
        return true;
    
    for (int i = 0; i < (ruleList.size()); i++) {
        if (location.startsWith(ruleList.get(i))) {
            return false;
        }
    }
    return true;
}