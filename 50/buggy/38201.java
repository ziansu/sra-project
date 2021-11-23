@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putInt(filtermusic.net.ui.favorites.FavoritesFragment.LAST_OPENED_VIEW, mViewFlipper.getDisplayedChild());
}