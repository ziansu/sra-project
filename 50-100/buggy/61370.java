private void clearFragmentManager() {
    if ((mFragmentManager.getFragments()) != null) {
        android.support.v4.app.FragmentTransaction ft = createTransactionWithOptions(null);
        for (android.support.v4.app.Fragment fragment : mFragmentManager.getFragments()) {
            if (fragment != null) {
                ft.remove(fragment);
            }
        }
        ft.commit();
        executePendingTransactions();
    }
}