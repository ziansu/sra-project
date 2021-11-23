@java.lang.Override
public void onBackPressed() {
    if ((getFragmentManager().getBackStackEntryCount()) > 0) {
        getFragmentManager().popBackStack();
        mFragmentBackStack.pop();
    }else
        super.onBackPressed();
    
}