@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    com.example.pc.flickr.models.FavoriteModel favoriteModel = dataSnapshot.getValue(com.example.pc.flickr.models.FavoriteModel.class);
    if (favoriteModel != null) {
        button.setBackgroundColor(android.support.v4.content.ContextCompat.getColor(getContext(), R.color.colorDanger));
        button.setText("Remove form WatchList");
        progressBar.setVisibility(View.GONE);
        mainContainer.setVisibility(View.VISIBLE);
        favorite = true;
    }else {
        favorite = false;
        progressBar.setVisibility(View.GONE);
        mainContainer.setVisibility(View.VISIBLE);
    }
}