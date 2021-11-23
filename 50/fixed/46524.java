@java.lang.Override
public void onBackPressed() {
    boolean doBack = ((wumf.com.sharedapps.OnBackPressedListener) (adapter.mFragmentList.get(currentFragmentIndex))).doBack(0);
    if (!doBack) {
        super.onBackPressed();
    }
}