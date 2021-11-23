@java.lang.Override
public void onPageSelected(int position) {
    java.lang.String title = "";
    switch (position) {
        case 0 :
            reli.reliapp.co.il.reli.main.HomeFragment.runningMy = true;
            reli.reliapp.co.il.reli.main.HomeFragment.runningAll = false;
            title = getString(R.string.middle_tab);
            break;
        case 1 :
            reli.reliapp.co.il.reli.main.HomeFragment.runningMy = false;
            reli.reliapp.co.il.reli.main.HomeFragment.runningAll = true;
            title = getString(R.string.right_tab);
            break;
    }
    ((reli.reliapp.co.il.reli.custom.CustomActivity) (getActivity())).getSupportActionBar().setTitle(title);
}