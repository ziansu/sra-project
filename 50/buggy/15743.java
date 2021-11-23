@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
    com.epicodus.socialite.models.User user = dataSnapshot.getValue(com.epicodus.socialite.models.User.class);
    mWelcomeTextView.setText((("Welcome, " + (user.getName())) + ", to"));
}