private void updateArrayList() {
    preferences = getActivity().getSharedPreferences(Config.SHARED_PREFERENCES, Context.MODE_PRIVATE);
    java.lang.String favouritesString = preferences.getString(Config.KEY_FAVOURITE_MEALS, "").trim();
    favourites = new java.util.ArrayList<java.lang.String>();
    if (!(favouritesString.isEmpty())) {
        java.lang.String[] favouritesArray = favouritesString.split(";");
        for (java.lang.String fav : favouritesArray) {
            favourites.add(fav);
        }
    }
}