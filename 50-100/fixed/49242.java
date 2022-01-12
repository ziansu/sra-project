@java.lang.Override
public void onClick(android.view.View view) {
    java.lang.String id = null;
    java.lang.Object o = getItem(mPosition);
    id = ((com.example.huangxueqin.zhihudaily.models.LatestNews.Story) (o)).id;
    if ((mListener) != null) {
        mListener.onRequestNews(id);
    }
}