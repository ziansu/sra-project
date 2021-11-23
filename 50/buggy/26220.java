public void setSort(java.lang.String key, boolean sortIt) {
    if ((sort) == null) {
        sort = new java.util.HashMap<java.lang.String, java.lang.Boolean>();
    }
    sort.put(key, java.lang.Boolean.valueOf(sortIt));
}