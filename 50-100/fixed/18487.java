public void goMap(android.view.View pView) {
    com.wikijourney.wikijourney.fragments.MapFragment newFragment = new com.wikijourney.wikijourney.fragments.MapFragment();
    android.app.FragmentTransaction transaction = getFragmentManager().beginTransaction();
    transaction.replace(R.id.fragment_container, newFragment);
    transaction.addToBackStack(null);
    transaction.commit();
}