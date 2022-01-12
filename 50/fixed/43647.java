protected void setPreviousSeparator(java.lang.String separator) {
    if ((mParams.size()) > 0) {
        mParams.get(((mParams.size()) - 1)).separator(separator);
    }
}