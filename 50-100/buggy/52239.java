@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    rootView = inflater.inflate(R.layout.posts_fragment_layout, null);
    butterknife.ButterKnife.bind(this, rootView);
    layoutManager = new android.support.v7.widget.LinearLayoutManager(getContext());
    adapter = new com.ben.wixexercise.view.adapters.PostsAdapter(this, favoritesList, this);
    favoritesPresenter.onCreate();
    return rootView;
}