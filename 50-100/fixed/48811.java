private boolean containsExcludeToken(java.lang.String agentString) {
    if ((excludeList) != null) {
        for (java.lang.String exclude : excludeList) {
            if ((agentString != null) && ((agentString.toLowerCase().indexOf(exclude.toLowerCase())) != (-1)))
                return true;
            
        }
    }
    return false;
}