private void removeLineFromFavorites() {
    team5.capstone.com.mysepta.Managers.FavoritesManager.removeRailLineFromFavorites(start, end);
    mOptionsMenu.findItem(R.id.favoriteIcon).setIcon(android.R.drawable.star_big_off);
    favorite = false;
}