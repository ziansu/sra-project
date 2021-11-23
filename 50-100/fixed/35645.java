public java.util.Set<java.lang.Integer> intersection(com.org.shark.graphtoolkits.applications.Group other) {
    java.util.HashSet<java.lang.Integer> res = new java.util.HashSet<java.lang.Integer>();
    java.util.Set<java.lang.Integer> members = other.getMemberList();
    if ((members == null) || ((this.memberList) == null))
        return res;
    
    for (java.lang.Integer mid : members) {
        if (this.memberList.contains(mid)) {
            res.add(mid);
        }
    }
    return res;
}