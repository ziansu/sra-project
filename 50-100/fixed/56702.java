@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    boolean anyParentIsRemoving = false;
    if ((Build.VERSION.SDK_INT) >= 17) {
        android.app.Fragment parent = getParentFragment();
        while ((!anyParentIsRemoving) && (parent != null)) {
            anyParentIsRemoving = parent.isRemoving();
            parent = parent.getParentFragment();
        } 
    }
    if (((isRemoving()) || anyParentIsRemoving) || (getActivity().isFinishing())) {
        getMvpDelegate().onDestroy();
    }
}