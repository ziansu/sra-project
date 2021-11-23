public void launchCamera() {
    if (isAdded()) {
        org.wordpress.android.ui.media.WordPressMediaUtils.launchCamera(getActivity(), this);
    }
}