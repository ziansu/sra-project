public int nextPage() throws java.lang.IndexOutOfBoundsException {
    if (((mTotalPages) > 0) && (((mCurrentPage) + 1) > (mTotalPages))) {
        throw new java.lang.IndexOutOfBoundsException("Error: Page out of index.");
    }
    return ++(mCurrentPage);
}