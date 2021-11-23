public java.lang.String getHeader() {
    if (null == (mParts)) {
        return "";
    }
    if ((mParts.length) < 1) {
        return "";
    }
    return mParts[0];
}