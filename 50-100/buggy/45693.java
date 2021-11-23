@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot snapshot) {
    java.lang.String data = snapshot.getValue().toString();
    if (data == null) {
        et.setText(defaultVal);
    }else {
        et.setText(data.toString());
    }
}