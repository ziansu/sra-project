public void openFragmentWithResult(android.support.v4.app.Fragment fragment, android.os.Bundle bundle, java.lang.String tag) {
    if (bundle != null) {
        fragment.setArguments(bundle);
    }
    android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
    if (tag != null) {
        transaction = transaction.replace(getContainerId(), fragment, tag);
    }else {
        transaction = transaction.replace(getContainerId(), fragment);
    }
    transaction.commitAllowingStateLoss();
}