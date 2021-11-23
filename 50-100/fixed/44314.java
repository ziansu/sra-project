public java.util.ArrayList<java.lang.String> getFavouriteMeals() {
    java.lang.String favouritesString = preferences.getString(Config.KEY_FAVOURITE_MEALS, "").trim();
    java.util.ArrayList<java.lang.String> favourites = new java.util.ArrayList<java.lang.String>();
    if (!(favouritesString.isEmpty())) {
        java.lang.String[] favouritesArray = favouritesString.split(";");
        for (java.lang.String fav : favouritesArray) {
            favourites.add(fav);
        }
    }
    return favourites;
}