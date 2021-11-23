public boolean sortIt(java.lang.String key) {
    return ((sort) == null) || ((sort.get(key)) == null) ? true : sort.get(key).booleanValue();
}