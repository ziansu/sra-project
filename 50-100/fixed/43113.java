@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String ip;
    java.lang.String url = _EditText2.getText().toString();
    try {
        client.SendInformationToServer(6000, url);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}