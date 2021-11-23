public org.apache.catalina.tribes.Member[] getMapMembersExcl(org.apache.catalina.tribes.Member[] exclude) {
    if (exclude == null) {
        return null;
    }
    synchronized(mapMembers) {
        @java.lang.SuppressWarnings(value = "unchecked")
        java.util.HashMap<org.apache.catalina.tribes.Member, java.lang.Long> list = ((java.util.HashMap<org.apache.catalina.tribes.Member, java.lang.Long>) (mapMembers.clone()));
        for (int i = 0; i < (exclude.length); i++)
            list.remove(exclude[i]);
        
        return getMapMembers(list);
    }
}