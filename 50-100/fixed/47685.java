private void changeRotation(int orientation, int lastOrientation) {
    switch (orientation) {
        case com.kalei.fragments.CameraFragment.ORIENTATION_PORTRAIT_NORMAL :
            rotateIcons(mCameraSwitch, 0);
            break;
        case com.kalei.fragments.CameraFragment.ORIENTATION_LANDSCAPE_NORMAL :
            rotateIcons(mCameraSwitch, 90);
            break;
        case com.kalei.fragments.CameraFragment.ORIENTATION_PORTRAIT_INVERTED :
            rotateIcons(mCameraSwitch, 180);
            break;
        case com.kalei.fragments.CameraFragment.ORIENTATION_LANDSCAPE_INVERTED :
            rotateIcons(mCameraSwitch, (-90));
            break;
    }
}