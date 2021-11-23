@java.lang.Override
public boolean onBackPressed() {
    if ((mStacks.size()) > 0) {
        com.lelife.android.framework.fragment.BaseFragment fra = ((com.lelife.android.framework.fragment.BaseFragment) (getCurrentFragment()));
        fra.setOnFinishListener(null);
        if (!(fra.onBackPressed())) {
            removeTopFragment();
            isFragmentInsideBack = false;
        }else {
            isFragmentInsideBack = true;
        }
        return true;
    }
    return false;
}