private java.lang.String addVals(java.lang.String set, java.lang.String get, int count) {
    if (set != null) {
        get += ("<li>" + set) + "</li>";
        count++;
    }
    return get;
}