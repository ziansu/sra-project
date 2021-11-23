@java.lang.Override
public void onComplete() {
    com.badou.mworking.util.SPHelper.setContactLastUpdateTime(mContext, java.util.Calendar.getInstance().getTimeInMillis());
    mProgressDialog.dismiss();
}