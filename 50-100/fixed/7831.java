@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            com.midoreigh.midopicker.CameraKitFragment cameraKitFragment = new com.midoreigh.midopicker.CameraKitFragment();
            com.midoreigh.midopicker.CameraKitFragment.setConfig(com.midoreigh.midopicker.ImagePickerActivity.getConfig());
            return cameraKitFragment;
        case 1 :
            return new com.midoreigh.midopicker.GalleryFragment();
        default :
            return null;
    }
}