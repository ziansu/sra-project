@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
    randomWord = dataSnapshot.child("text").getValue().toString();
    wordBtn.setText(randomWord);
    fireBaseWords.child("Active").setValue(true);
}