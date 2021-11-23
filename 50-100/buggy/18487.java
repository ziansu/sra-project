public void goMap(android.view.View pView) {
    android.content.Intent mapIntent = new android.content.Intent(pView.getContext(), com.wikijourney.wikijourney.MapActivity.class);
    com.wikijourney.wikijourney.fragments.MapFragment newFragment = new com.wikijourney.wikijourney.fragments.MapFragment();
    newFragment.setArguments(mapIntent.getExtras());
    android.app.FragmentTransaction transaction = getFragmentManager().beginTransaction();
    transaction.replace(R.id.fragment_container, newFragment);
    transaction.addToBackStack(null);
    transaction.commit();
}