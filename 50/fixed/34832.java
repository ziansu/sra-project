@java.lang.Override
public void onLoaded(@android.support.annotation.NonNull
com.demo.navigator.ds.model.Entry entry) {
    if ((mBinding) == null) {
        return ;
    }
    navigateEntry(entry, true);
    mBinding.getFragment().getChildFragmentManager().addOnBackStackChangedListener(this);
}