@java.lang.Override
public void onBackPressed() {
    handler.sendEmptyMessage(MSG_CALL_END);
    saveCallRecord(0);
    finish();
    super.onBackPressed();
}