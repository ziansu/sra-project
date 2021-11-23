@java.lang.Override
public void onClick(android.view.View v) {
    mCode = smsET.getText().toString();
    if ((mCode.length()) > 1) {
        app.getNet().ActivateAccount(mId, mKey, mCode);
        finish();
    }else
        android.widget.Toast.makeText(this, "Введите код из СМС", Toast.LENGTH_SHORT).show();
    
}