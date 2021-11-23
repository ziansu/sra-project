@java.lang.Override
public void onBackPressed() {
    android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
    if ((fm.getBackStackEntryCount()) > 1) {
        if (((mEditCircleFragment) != null) && (mEditCircleFragment.isVisible())) {
            mImageUriHolder.setData(null);
        }
        fm.popBackStackImmediate();
    }else {
        super.onBackPressed();
    }
}