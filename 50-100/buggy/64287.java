@java.lang.Override
public void onComplete(com.google.firebase.database.DatabaseError databaseError, com.google.firebase.database.DatabaseReference databaseReference) {
    if (databaseError != null) {
        android.widget.Toast.makeText(this, databaseError.getMessage(), Toast.LENGTH_SHORT).show();
        hideProgressDialog();
    }else {
        mEtId.setText("");
        mEtName.setText("");
        mEtCity.setText("");
        mEtCountry.setText("");
        android.widget.Toast.makeText(this, "Deleted successfully", Toast.LENGTH_SHORT).show();
        getDatFromDataBase();
    }
}