@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.iv_send_msg :
            java.lang.String message = editText.getText().toString().trim();
            java.lang.String address = phone.getText().toString().trim();
            sendSms(message, address);
            editText.setText("");
            break;
    }
}