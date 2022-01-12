public boolean isA(java.lang.String group) throws java.io.IOException {
    java.lang.String[] gs = groups;
    if ((groups) == null)
        gs = ((java.lang.String[]) (getUserInfo().get("groups")));
    
    for (java.lang.String g : gs)
        if (g.equals(group))
            return true;
        
    
    return false;
}