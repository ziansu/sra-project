@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    dataSnapshot.getRef().child("Name").removeValue();
    dataSnapshot.getRef().child("date_of_birth").removeValue();
    dataSnapshot.getRef().child("zodiac_sign").removeValue();
    dataSnapshot.getRef().child("chinese_zodiac_sign").removeValue();
}