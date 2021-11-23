public void handleFavButtonClick() {
    android.widget.Toast.makeText(getActivity(), "buttonClicked", Toast.LENGTH_SHORT).show();
    if (isFavourite) {
        android.util.Log.d("TAG", "about to remove from favourites");
        adjustFavButton(false);
        removeFromFavourites();
    }else {
        android.util.Log.d("TAG", "about to add to favourites");
        adjustFavButton(true);
        addToFavourites();
    }
}