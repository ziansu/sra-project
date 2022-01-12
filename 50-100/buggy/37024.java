private void loadFragment(int ID, android.app.Fragment fragment, boolean backStack, boolean clearBackStack) {
    android.app.FragmentManager fm = getFragmentManager();
    android.app.FragmentTransaction ft = fm.beginTransaction().detach(cf).replace(ID, fragment).attach(fragment);
    if (clearBackStack) {
        fm.popBackStack();
        fm.popBackStack();
    }
    if (backStack) {
        ft.addToBackStack(null);
    }
    ft.commit();
    fm.executePendingTransactions();
}