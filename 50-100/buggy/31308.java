void showListFragment() {
    android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    listFragment = new com.bathem.vocabpower.Fragment.ListFragment();
    ft.replace(R.id.main_placeholder, listFragment, com.bathem.vocabpower.Activity.VocabListActivity.TAG_FRAMENT_LIST);
    ft.commit();
    isDetailFragmentVisible = false;
    showAddVocabButton(View.VISIBLE);
}