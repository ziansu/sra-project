public void onEventMainThread(at.rosinen.Noctis.events.FragmentChangeEvent fragmentChangeEvent) {
    android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    ft.replace(R.id.fragementBase, fragmentChangeEvent.fragment);
    ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
    if (fragmentChangeEvent.addToBackstack) {
        ft.addToBackStack(fragmentChangeEvent.fragment.getClass().getName());
    }
    ft.commit();
}