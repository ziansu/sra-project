protected void onClickSend(android.view.View v) {
    switch (v.getId()) {
        case R.id.SMS_SEND_BUTTON :
            java.lang.String input = editText.getText().toString();
            android.telephony.SmsManager smsManager = android.telephony.SmsManager.getDefault();
            smsManager.sendTextMessage(address, null, input, null, null);
            finish();
            break;
    }
}