public void toggleFavorite() {
    io.realm.Realm realm = io.realm.Realm.getDefaultInstance();
    realm.beginTransaction();
    if (data.isFavorite()) {
        data.setFavorite(false);
        favoriteButton.setBackgroundResource(R.drawable.star_empty);
    }else {
        data.setFavorite(true);
        favoriteButton.setBackgroundResource(R.drawable.star_full);
    }
    realm.copyToRealmOrUpdate(data);
    realm.commitTransaction();
    realm.close();
}