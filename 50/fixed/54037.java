@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (savedInstanceState == null) {
        setInitialFragment(com.shollmann.android.fogon.ui.fragments.FavoriteSongsFragment.newInstance());
    }
}