@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    if ((dataSnapshot.getChildrenCount()) > 0) {
        com.google.firebase.database.DataSnapshot child = dataSnapshot.getChildren().iterator().next();
        if (movieId.equals(child.getKey().toString())) {
            isFavorite = true;
            android.util.Log.v("myyy", "exists");
        }
    }else {
        isFavorite = false;
        android.util.Log.v("myyy", "doesn't exists");
    }
    toggleFavButton();
}