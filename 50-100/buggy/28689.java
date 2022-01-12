private void clearFragmentManager() {
    if ((mFragmentManager.getFragments()) != null) {
        android.support.v4.app.FragmentTransaction ft = mFragmentManager.beginTransaction();
        ft.setTransition(mTransitionMode);
        for (android.support.v4.app.Fragment fragment : mFragmentManager.getFragments()) {
            ft.remove(fragment);
        }
        ft.commit();
        executePendingTransactions();
    }
}