@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    try {
        java.lang.Double value = ((java.lang.Double) (dataSnapshot.getValue()));
        if (value != null) {
            myRef.child(path).setValue((value + passedValue));
        }else {
            myRef.child(path).setValue(passedValue);
        }
    } catch (java.lang.Exception e) {
        android.util.Log.d("Error catched", e.toString());
    }
}