@java.lang.Override
public boolean onBackPressed() {
    if ((mStacks.size()) > 0) {
        com.lelife.android.framework.fragment.BaseFragment fra = ((com.lelife.android.framework.fragment.BaseFragment) (getCurrentFragment()));
        if (!(fra.onBackPressed())) {
            fra.setOnFinishListener(null);
            removeTopFragment();
            isFragmentInsideBack = false;
        }else {
            isFragmentInsideBack = true;
        }
        return true;
    }
    return false;
}