private void getFavoriteList() {
    java.util.Map<java.lang.String, ?> keys = sharedPreferences.getAll();
    favoriteItemList.clear();
    for (java.util.Map.Entry<java.lang.String, ?> entry : keys.entrySet()) {
        favoriteItemList.add(new in.codehex.shopit.model.FavoriteItem(entry.getValue().toString()));
        adapter.notifyDataSetChanged();
    }
    if (favoriteItemList.isEmpty()) {
        android.widget.Toast.makeText(getApplicationContext(), "Add products to favorites", Toast.LENGTH_SHORT).show();
    }
}