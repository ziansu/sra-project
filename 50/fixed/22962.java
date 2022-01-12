@java.lang.Override
public void onPause() {
    super.onPause();
    getPresenter().putWishlist(wishlist);
}