@butterknife.OnClick(value = R.id.text_send_log)
public void onClickTextSendLog() {
    if (isDataLogSelected) {
        android.util.Log.d(Constants.LOG_TAG, "onClickTextSendLog");
        org.cmucreatelab.flutter_android.ui.dialogs.EmailDialog emailDialog = org.cmucreatelab.flutter_android.ui.dialogs.EmailDialog.newInstance(workingDataSet);
        emailDialog.show(getSupportFragmentManager(), "tag");
    }
}