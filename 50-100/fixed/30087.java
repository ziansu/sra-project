@java.lang.Override
public void onPageSelected(int position) {
    switch (position) {
        case 0 :
            mActivityMainBinding.appBarMain.fab.setVisibility(View.INVISIBLE);
            mActivityMainBinding.appBarMain.fam.setVisibility(View.VISIBLE);
            break;
        case 1 :
            mActivityMainBinding.appBarMain.fam.collapse();
            mActivityMainBinding.appBarMain.fab.setVisibility(View.VISIBLE);
            mActivityMainBinding.appBarMain.fam.setVisibility(View.INVISIBLE);
    }
}