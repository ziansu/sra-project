@java.lang.Override
public void unLiked(com.like.LikeButton likeButton) {
    firebaseutils.removelike(offlinedata.Id);
    holder.favoriteButton.setLiked(false);
    android.widget.Toast.makeText(com.example.massa.luxvilla.adaptadores.adaptadorrvtodasoffline.ctx, offlinedata.Id, Toast.LENGTH_LONG).show();
}