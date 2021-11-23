public static java.util.List<com.shentu.microdream.data.event.ArticleSuggestion> getSuggestions() {
    java.util.Set<java.lang.String> mHistorySet = MicroDreamApplication.mSPUtils.getStringSet(Constant.SEARCH_HISTORY);
    java.util.Iterator<java.lang.String> it = mHistorySet.iterator();
    java.util.List<com.shentu.microdream.data.event.ArticleSuggestion> mList = new java.util.ArrayList<>();
    while (it.hasNext()) {
        mList.add(new com.shentu.microdream.data.event.ArticleSuggestion(it.next()));
    } 
    return mList;
}