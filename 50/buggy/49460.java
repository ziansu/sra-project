private void doLockScreenAnimation() {
    android.util.Log.d(com.vitaminbacon.lockscreendialer.LockScreenActivity.TAG, "doLockScreenAnimation() called");
    android.view.View lockScreen = mWrapperView.findViewById(R.id.lock_screen_interaction_container);
    lockScreen.animate().translationX(0);
}