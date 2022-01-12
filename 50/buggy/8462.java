@java.lang.Override
protected void onResume() {
    super.onResume();
    if (org.kore.kolabnotes.android.Utils.getReloadDataAfterDetail(this)) {
        org.kore.kolabnotes.android.Utils.setReloadDataAfterDetail(this, false);
        overviewFragment.setFromDetail();
    }
}