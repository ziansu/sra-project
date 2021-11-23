@butterknife.OnClick(value = R.id.fab)
void onFabClick() {
    it.polimi.dima.giftlist.presentation.navigation.IntentStarter.startWishlistSettingsActivity(getContext(), Wishlist.DEFAULT_ID, wishlistListAdapter.getWishlistList().size());
}