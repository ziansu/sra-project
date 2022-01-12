public java.util.ArrayList<java.lang.String> getFavouriteMeals() {
    java.lang.String favouritesString = preferences.getString(Config.KEY_FAVOURITE_MEALS, "");
    java.lang.String[] favouritesArray = favouritesString.split(";");
    java.util.ArrayList<java.lang.String> favourites = new java.util.ArrayList<java.lang.String>();
    for (java.lang.String fav : favouritesArray) {
        favourites.add(fav);
    }
    return favourites;
}