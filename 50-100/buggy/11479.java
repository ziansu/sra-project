@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    java.util.ArrayList<java.lang.String> oldReviews = new java.util.ArrayList<>();
    for (com.google.firebase.database.DataSnapshot child : dataSnapshot.getChildren()) {
        java.lang.String oldSearchTerm = child.getValue().toString();
        oldReviews.add(oldSearchTerm);
    }
    java.lang.String reviewID = (profile) + (oldReviews.size());
    getReference(reviewID);
}