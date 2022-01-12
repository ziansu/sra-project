@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    newAd.child("Name").setValue(dataSnapshot.child("Name").getValue().toString());
    newAd.child("Mobileno").setValue(dataSnapshot.child("Mobileno").getValue().toString());
}