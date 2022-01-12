public java.lang.String[] findNIM(java.lang.String where) {
    this.by = 0;
    this.where = where.trim().toLowerCase();
    this.whereLength = where.length();
    sortArray(by, "DESC");
    int idx = clearBinarySearch(where);
    if (idx == (-1)) {
        return null;
    }
    return mhs[idx];
}