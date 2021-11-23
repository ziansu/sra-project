private java.util.List<com.tetsuyanh.esandroid.entity.Post> getList(java.lang.String teamName) {
    java.util.List<com.tetsuyanh.esandroid.entity.Post> list = mTeamPostList.get(teamName);
    if (list == null) {
        list = com.tetsuyanh.esandroid.db.BookmarkHelper.getList(mContext, mTeamManager.getTeamId(teamName));
        mTeamPostList.put(teamName, list);
    }
    return list;
}