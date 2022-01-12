@java.lang.Override
protected void onPreExecute() {
    tvNoNetwork.setVisibility(View.GONE);
    if ((topStoryIds) == null) {
        srlNews.setVisibility(View.GONE);
        pbNews.setVisibility(View.VISIBLE);
    }
    topStoryIds = new java.util.ArrayList<>();
    mIsLoadingArticle = true;
    super.onPreExecute();
}