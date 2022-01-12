@java.lang.Override
public void nextFragment() {
    if ((currentFragment) instanceof org.akvo.akvoqr.CameraPrepareFragment) {
        currentFragment = org.akvo.akvoqr.CameraInstructionFragment.newInstance(brandName);
    }else
        if ((currentFragment) instanceof org.akvo.akvoqr.CameraInstructionFragment) {
            currentFragment = org.akvo.akvoqr.CameraStartTestFragment.newInstance(brandName);
        }
    
    getSupportFragmentManager().beginTransaction().replace(R.id.activity_cameraFragmentPlaceholder, currentFragment).commit();
}