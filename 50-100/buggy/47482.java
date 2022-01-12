public static void launchPictureLibraryOrCapture(android.app.Fragment fragment, java.lang.String applicationId, org.wordpress.android.ui.media.WordPressMediaUtils.LaunchCameraCallback callback) {
    if (!(fragment.isAdded())) {
        return ;
    }
    org.wordpress.passcodelock.AppLockManager.getInstance().setExtendedTimeout();
    fragment.startActivityForResult(org.wordpress.android.ui.media.WordPressMediaUtils.makePickOrCaptureIntent(fragment.getActivity(), applicationId, callback), RequestCodes.PICTURE_LIBRARY_OR_CAPTURE);
}