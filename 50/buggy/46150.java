@java.lang.Override
public void onBackPressed() {
    if ((getFragmentManager().getBackStackEntryCount()) == 0) {
        super.onBackPressed();
    }else {
        getFragmentManager().popBackStack();
    }
}