@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_shared, container, false);
    butterknife.ButterKnife.bind(this, view);
    mArticles = nytController.getMostSharedArticles();
    setArticlesList();
    mArticles.addChangeListener(new io.realm.RealmChangeListener<io.realm.RealmResults<com.android.pena.david.news4u.model.Article>>() {
        @java.lang.Override
        public void onChange(io.realm.RealmResults<com.android.pena.david.news4u.model.Article> articles) {
            newArticles(articles);
            refreshArticles.setRefreshing(false);
        }
    });
    return view;
}