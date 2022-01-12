@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(getApplicationContext(), "CALL ACTION", Toast.LENGTH_SHORT).show();
    java.lang.String phone = mPhone.getText().toString();
    android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_CALL);
    intent.setData(android.net.Uri.parse(("tel:" + phone)));
    try {
        startActivity(intent);
    } catch (java.lang.SecurityException e) {
        android.widget.Toast.makeText(getApplicationContext(), e.toString(), Toast.LENGTH_SHORT).show();
    }
}