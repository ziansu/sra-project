public void SwitchHandler(android.view.View view) {
    android.app.FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
    if (activeFragment) {
        transaction.replace(R.id.fragment_container, filterFragment);
    }else {
        transaction.replace(R.id.fragment_container, eventsFragment);
        eventsFragment.refreshData();
    }
    transaction.commit();
    activeFragment = !(activeFragment);
}