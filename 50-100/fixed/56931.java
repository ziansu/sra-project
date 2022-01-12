@java.lang.Override
public void onAddExpense() {
    android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
    manager.popBackStack();
    hideFab(false);
    if ((mOverallExpensesFragment) == null) {
        mOverallExpensesFragment = new com.examples.ankit.breakpoint.reports.OverallExpensesFragment();
        loadFragment(mOverallExpensesFragment);
    }else {
        mOverallExpensesFragment.addOrUpdateChart();
    }
}