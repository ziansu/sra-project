public boolean sameComponent(java.lang.String u, java.lang.String v) {
    int i = 0;
    while ((SCCs.get(i).containsKey(u.hashCode())) == false) {
        i++;
    } 
    if (SCCs.get(i).containsKey(v.hashCode()))
        return true;
    
    return false;
}