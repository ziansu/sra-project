@java.lang.Override
public boolean onContextItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case org.wordpress.android.ui.posts.EditPostSettingsFragment.SELECT_LIBRARY_MENU_POSITION :
            launchMediaGalleryActivity();
            return true;
        case org.wordpress.android.ui.posts.EditPostSettingsFragment.CLEAR_FEATURED_IMAGE_MENU_POSITION :
            mFeaturedImageId = -1;
            mFeaturedImageView.setVisibility(View.GONE);
            mFeaturedImageButton.setVisibility(View.VISIBLE);
            return true;
        default :
            return false;
    }
}