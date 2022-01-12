void removeEmptyUsers(java.util.HashSet users) {
    for (java.util.Iterator iterator = users.iterator(); iterator.hasNext();) {
        java.lang.Object item = iterator.next();
        if ((item == null) || (((java.lang.String) (item)).trim().isEmpty())) {
            iterator.remove();
        }
    }
}