private void handleAction(final int index, int action) {
    switch (action) {
        case com.codingspezis.android.metalonly.player.fragments.FavoritesFragment.ITEM_CLICK_ACTION_WISH :
            wishSong(index);
            break;
        case com.codingspezis.android.metalonly.player.fragments.FavoritesFragment.ITEM_CLICK_ACTION_YOUTUBE :
            searchSongOnYoutube(index);
            break;
        case com.codingspezis.android.metalonly.player.fragments.FavoritesFragment.ITEM_CLICK_ACTION_SHARE :
            shareSong(index);
            break;
        case com.codingspezis.android.metalonly.player.fragments.FavoritesFragment.ITEM_CLICK_ACTION_DELETE :
            deleteSong(index);
    }
}