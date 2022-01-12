@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    if (dataSnapshot.getValue().equals("null")) {
        progress.dismiss();
        android.widget.Toast.makeText(this, "The username does not exist", Toast.LENGTH_SHORT).show();
        clearFields();
    }else {
        java.lang.String userId = dataSnapshot.getValue(java.lang.String.class);
        login(userId, getPW);
    }
}