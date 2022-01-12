public void show(final android.app.FragmentManager manager) {
    android.app.FragmentTransaction transaction = manager.beginTransaction();
    android.app.Fragment prev = manager.findFragmentByTag(ru.shmakinv.android.widget.material.searchview.BaseRestoreInstanceFragment.DIALOG_TAG);
    if (prev != null) {
        transaction.remove(prev);
    }
    transaction.add(this, ru.shmakinv.android.widget.material.searchview.BaseRestoreInstanceFragment.DIALOG_TAG);
    transaction.commitAllowingStateLoss();
    manager.executePendingTransactions();
    mVisible = true;
}