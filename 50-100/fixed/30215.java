private java.lang.String getLabelText() {
    if ((totalCount) == 0) {
        return "No documents found.";
    }
    long min = (currentPage) * (pageSize);
    long max = (pageSize) * ((currentPage) + 1);
    if (max > (totalCount)) {
        max = totalCount;
    }
    return (((min + "-") + max) + " of ") + (totalCount);
}