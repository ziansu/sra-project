private void writeDisplayFragment(boolean status, double pace) {
    pudding.com.cardio.DisplayFragment displayFragment = ((pudding.com.cardio.DisplayFragment) (getFragmentManager().findFragmentById(R.id.frame_fragment_display)));
    if (displayFragment != null) {
        displayFragment.putStatus(status);
        displayFragment.putPace(pace);
    }
}