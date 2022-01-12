@java.lang.Override
public void onPageSelected(int position) {
    java.lang.String title = "";
    switch (position) {
        case 0 :
            title = getString(R.string.middle_tab);
            break;
        case 1 :
            title = getString(R.string.right_tab);
            break;
    }
    ((reli.reliapp.co.il.reli.custom.CustomActivity) (getActivity())).getSupportActionBar().setTitle(title);
}