public void onCancelRecorder(android.view.View v) {
    android.support.v4.app.Fragment f = getSupportFragmentManager().findFragmentById(R.id.main_fragment_container);
    if (f instanceof vietnamworks.com.pal.RecorderFragment) {
        ((vietnamworks.com.pal.RecorderFragment) (f)).stopPlayer();
    }
    android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
    vietnamworks.com.pal.TalkWithMeFragment next = vietnamworks.com.pal.TalkWithMeFragment.create();
    transaction.replace(R.id.main_fragment_container, next);
    transaction.commit();
}