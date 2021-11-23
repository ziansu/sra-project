public synchronized void resetFavorite() {
    loadFilters(new java.io.File("./favorites/EMPTY"));
    saveCurrFilters(new java.io.File(("./favorites/" + ((currFav) + 1))));
    favFilters[currFav] = loadFilters(new java.io.File(("./favorites/" + ((currFav) + 1))));
    changeFilters(favFilters[currFav]);
}