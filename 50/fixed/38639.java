public boolean isMatchUrl(java.lang.String url) {
    return ((mPattern) != null) && (mPattern.matcher(url).find());
}