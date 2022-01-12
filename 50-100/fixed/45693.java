@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot snapshot) {
    if ((snapshot.getValue()) == null) {
        et.setText(defaultVal);
    }else {
        java.lang.String data = snapshot.getValue().toString();
        et.setText(data.toString());
    }
}