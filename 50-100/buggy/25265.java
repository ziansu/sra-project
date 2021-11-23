@java.lang.Override
public void handleMessage(android.os.Message msg) {
    super.handleMessage(msg);
    java.util.List<net.sharermax.m_news.adapter.DatabaseAdapter.NewsDataRecord> list = ((java.util.List<net.sharermax.m_news.adapter.DatabaseAdapter.NewsDataRecord>) (msg.obj));
    if (!(list.isEmpty())) {
        net.sharermax.m_news.activity.FavoriteActivity favoriteActivity = mActivity.get();
        favoriteActivity.updateData(list);
    }
}