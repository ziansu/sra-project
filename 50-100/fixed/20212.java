@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if ((requestCode == (com.github.yeriomin.smsscheduler.Activity.SmsListActivity.REQUEST_CODE)) && (resultCode != 0)) {
        int messageId;
        switch (resultCode) {
            case AddSmsActivity.RESULT_SCHEDULED :
                messageId = R.string.successfully_scheduled;
                break;
            case AddSmsActivity.RESULT_UNSCHEDULED :
                messageId = R.string.successfully_unscheduled;
                break;
            default :
                messageId = R.string.error_generic;
                java.lang.System.out.println(("Unknown AddSmsActivity result code: " + resultCode));
                break;
        }
        android.widget.Toast.makeText(getApplicationContext(), getString(messageId), Toast.LENGTH_SHORT).show();
    }
}