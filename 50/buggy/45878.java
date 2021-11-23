@java.lang.Override
public void accept(@io.reactivex.annotations.NonNull
java.util.List<com.lixinwei.www.goldennews.data.model.StoryForRealm> stories) throws java.lang.Exception {
    mNewsListView.showTopStories(stories);
    mRealmService.insertStories(stories);
}