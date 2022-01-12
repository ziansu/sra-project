public java.lang.String[][] search(int by, java.lang.String where) {
    this.by = by;
    this.where = where.trim();
    this.whereLength = where.length();
    sortArray(by, "DESC");
    int idx = partialBinarySearch(where);
    java.lang.System.out.println(idx);
    if (idx != (-1)) {
        searchRes = like(idx);
    }else {
        searchRes = null;
    }
    return searchRes;
}