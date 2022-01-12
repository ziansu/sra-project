@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    if (bundleExtra != null) {
        if ((user.getDisplayName()) != null) {
            artRated = ((java.util.HashMap<java.lang.String, java.lang.String>) (dataSnapshot.child("Users").child(user.getDisplayName()).child("rated").getValue()));
            updateRatingView();
            addClickListeners();
        }
    }
}