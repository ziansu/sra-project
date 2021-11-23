public void showAppFragment(it.polito.mad.countonme.SharingActivity.AppFragment fragment, boolean addToBackStack) {
    if (fragment == (mCurrentFragment))
        return ;
    
    mCurrentFragment = fragment;
    android.app.FragmentTransaction transaction = mFragmentManager.beginTransaction();
    transaction.replace(android.R.id.content, mFragmentsList[mCurrentFragment.ordinal()]);
    if (addToBackStack == true)
        transaction.addToBackStack(fragment.name());
    
    transaction.commit();
}