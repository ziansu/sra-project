public void onClick(android.content.DialogInterface dialog, int id) {
    org.openobservatory.ooniprobe.data.TestStorage.removeAllTests(this, this);
    org.openobservatory.ooniprobe.fragment.PastTestsFragment pastTestsFragment = ((org.openobservatory.ooniprobe.fragment.PastTestsFragment) (getSupportFragmentManager().findFragmentByTag("org.openobservatory.ooniprobe.fragment.PastTestsFragment")));
    if ((pastTestsFragment != null) && (pastTestsFragment.isVisible())) {
        pastTestsFragment.updateList();
    }
}