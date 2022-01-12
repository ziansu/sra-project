@java.lang.Override
public boolean equals(java.lang.Object o) {
    com.topfeeds4j.ds.NewsEntry other = ((com.topfeeds4j.ds.NewsEntry) (o));
    return ((((android.text.TextUtils.equals(mTitle, other.mTitle)) && (android.text.TextUtils.equals(mDesc, other.mDesc))) && (android.text.TextUtils.equals(mUrl, other.mUrl))) && (android.text.TextUtils.equals(mUrlMobile, other.mUrlMobile))) && ((mPubDate) == (other.mPubDate));
}