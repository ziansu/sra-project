@java.lang.Override
public void onParsrTelevisionUrlCallback(java.util.List<com.zx.wfm.bean.Televisionbean> list, java.lang.String url) {
    com.zx.wfm.dao.DBManager.getInstance().saveTelevisions(list);
    movieAdapter.addAll(com.zx.wfm.dao.DBManager.getInstance().getTelevisionList(url));
    refreshCompelete(swipeToLoadLayout, list);
}