@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent i = new android.content.Intent("ml.yats.connect.mainactivity");
    i.putExtra("mode", "router");
    i.putExtra("number", mPhoneText.getText().toString());
    startActivity(i);
}