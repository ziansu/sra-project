@butterknife.OnClick(value = R.id.text_send_log)
public void onClickTextSendLog() {
    if (isDataLogSelected) {
        android.util.Log.d(Constants.LOG_TAG, "onClickTextSendLog");
    }
}