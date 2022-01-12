public java.lang.String getData() {
    if (null == (mParts)) {
        return "";
    }
    if ((mParts.length) < 3) {
        return "";
    }
    return mParts[2];
}