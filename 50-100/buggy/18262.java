private void showPreview() {
    fragmentState = org.cientopolis.samplers.ui.take_sample.PhotoFragment.PhotoFragmentState.SHOWING_PREVIEW;
    if ((camera_fragment) != null) {
        android.app.FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.remove(camera_fragment);
        transaction.commit();
        camera_fragment = null;
    }
    showPreviewLayout(imageURI, imageURI.getPath());
}