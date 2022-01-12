@java.lang.Override
public void unLiked(com.like.LikeButton likeButton) {
    firebaseutils.removelike(offlinedata.Id);
    holder.favoriteButton.setLiked(false);
}