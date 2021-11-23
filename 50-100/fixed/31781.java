@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    if ((dataSnapshot.getChildrenCount()) > 0) {
        for (com.google.firebase.database.DataSnapshot child : dataSnapshot.getChildren()) {
            if (movieId.equals(child.getKey().toString())) {
                isFavorite = true;
                break;
            }else {
                isFavorite = false;
            }
        }
    }
    toggleFavButton();
}