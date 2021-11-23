java.util.HashSet notfoundUsers(java.util.HashSet users, java.util.HashSet fullset) {
    java.util.HashSet notfound = new java.util.HashSet();
    for (java.util.Iterator iterator = users.iterator(); iterator.hasNext();) {
        java.lang.Object user = iterator.next();
        if (!(fullset.contains(user))) {
            notfound.add(user);
        }
    }
    return notfound;
}