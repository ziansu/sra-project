public int getStartIndex(int page) {
    if (page <= (totalPage)) {
        int start = (page - 1) * (numPerPage);
        return start;
    }else {
        return ((totalPage) - 1) * (numPerPage);
    }
}