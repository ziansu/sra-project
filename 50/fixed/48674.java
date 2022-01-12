private void loadPasscodeView() {
    PASSCODE_STEP = 0;
    updateScreen();
    android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
    fragmentTransaction.replace(R.id.blank_container, getPasscodeFragment());
    fragmentTransaction.commit();
}