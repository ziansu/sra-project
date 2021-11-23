@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    android.util.Log.d(name.vampidroid.VampiDroid.TAG, "onTextChanged: ");
    for (name.vampidroid.fragments.CardsListFragment fragment : ((name.vampidroid.ViewPagerAdapter) (viewPager.getAdapter())).getRegisteredFragments()) {
        android.util.Log.d(name.vampidroid.VampiDroid.TAG, ("onTextChanged: Thread Id: " + (java.lang.Thread.currentThread().getId())));
        fragment.getCardsAdapter().getFilter().filter(s);
    }
}