@java.lang.Override
public void onClick(android.view.View view) {
    java.lang.String id = null;
    java.lang.Object o = getItem(mPosition);
    if (o instanceof com.example.huangxueqin.zhihudaily.models.LatestNews.Story) {
        id = ((com.example.huangxueqin.zhihudaily.models.LatestNews.Story) (o)).id;
    }else {
        java.util.List<com.example.huangxueqin.zhihudaily.models.LatestNews.TopStory> topStories = ((java.util.List<com.example.huangxueqin.zhihudaily.models.LatestNews.TopStory>) (o));
        id = topStories.get(mTopStoriesGallery.getCurrentItem()).id;
    }
    if ((mListener) != null) {
        mListener.onRequestNews(id);
    }
}