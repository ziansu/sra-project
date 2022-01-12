private void prepareLockScreenAnimation() {
    android.util.Log.d(com.vitaminbacon.lockscreendialer.LockScreenActivity.TAG, "prepareLockScreenAnimation() called");
    android.view.View sheathScreen = mWrapperView.findViewById(R.id.lock_screen_sheath_container);
    android.view.View lockScreen = mWrapperView.findViewById(R.id.lock_screen_interaction_container);
    lockScreen.setTranslationX(getDisplayWidth());
    lockScreen.setVisibility(View.VISIBLE);
    sheathScreen.setVisibility(View.INVISIBLE);
}