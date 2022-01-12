@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((presenter) == null)
        setPresenter(new husaynhakeem.io.popularmovies.features.favorites.FavoritesPresenter());
    
    presenter.setView(this);
    presenter.start();
    adapter = new husaynhakeem.io.popularmovies.features.favorites.FavoritesAdapter(null, this);
}