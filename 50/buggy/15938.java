@java.lang.Override
public void onError(java.lang.Throwable e) {
    android.widget.Toast.makeText(mContext, "onError()!", Toast.LENGTH_SHORT).show();
    e.printStackTrace();
    mIBlibiliFragment.hideProgressbar();
    mIBlibiliFragment.showError(e.getMessage());
}