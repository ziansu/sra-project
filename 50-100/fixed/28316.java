public void openFragmentWithResult(android.support.v4.app.Fragment fragment, java.lang.String tag) {
    android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
    if (tag != null) {
        transaction = transaction.replace(getContainerId(), fragment, tag);
    }else {
        transaction = transaction.replace(getContainerId(), fragment);
    }
    transaction.commitAllowingStateLoss();
}