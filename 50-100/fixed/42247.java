private void updateFavoriteButton(int championId) {
    if (!(com.carlospinan.lolguide.helpers.StorageHelper.get().getChampion(championId))) {
        favoriteChampionsAction.setColorFilter(getResources().getColor(R.color.black));
    }else {
        favoriteChampionsAction.setColorFilter(getResources().getColor(R.color.yellow));
    }
}