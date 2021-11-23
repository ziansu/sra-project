public com.squareup.okhttp.HttpUrl.Builder encodedFragment(java.lang.String encodedFragment) {
    if (encodedFragment == null)
        throw new java.lang.IllegalArgumentException("encodedFragment == null");
    
    this.encodedFragment = com.squareup.okhttp.HttpUrl.canonicalize(encodedFragment, com.squareup.okhttp.HttpUrl.FRAGMENT_ENCODE_SET, true, false);
    return this;
}