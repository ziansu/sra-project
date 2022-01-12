@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    newAd.child("Name").setValue(dataSnapshot.child("Name").toString().trim());
    newAd.child("Mobileno").setValue(dataSnapshot.child("Mobileno").toString().trim());
}