@java.lang.Override
public void OnGetTelevisionFromLeadCload(java.util.List<com.zx.wfm.bean.Televisionbean> list, java.lang.String url) {
    movieAdapter.addAll(com.zx.wfm.dao.DBManager.getInstance().getTelevisionList(url));
    refreshCompelete(swipeToLoadLayout, movieAdapter.getmList());
}