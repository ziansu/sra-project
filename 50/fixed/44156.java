@java.lang.Override
public void addFragment(android.support.v4.app.Fragment fragment, java.lang.String tag) {
    this.fragment = fragment;
    getSupportFragmentManager().beginTransaction().replace(R.id.main_content, fragment).commit();
    getSupportFragmentManager().executePendingTransactions();
}