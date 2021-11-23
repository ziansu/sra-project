public net.jejer.hipda.bean.DetailBean getPostByPostId(java.lang.String postId) {
    java.lang.Integer page = mPostIdToPageMap.get(postId);
    if (((page != null) && (page > 0)) && ((mCache.get(page)) != null)) {
        return mCache.get(page).getPostInPage(postId);
    }
    return null;
}