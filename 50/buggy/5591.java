@java.lang.Override
protected void onRestart() {
    super.onRestart();
    mBtnAdapter.deleteAll();
    mBtnAdapter.notifyDataSetChanged();
}