public com.danimahardhika.cafebar.CafeBar.Builder typeface(java.lang.String contentFontName, java.lang.String buttonFontName) {
    mContentTypeface = com.danimahardhika.cafebar.CafeBarUtil.getTypeface(mContext, contentFontName);
    mNeutralTypeface = mPositiveTypeface = mNegativeTypeface = com.danimahardhika.cafebar.CafeBarUtil.getTypeface(mContext, buttonFontName);
    return this;
}