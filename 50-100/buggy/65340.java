private void setFavorited(android.widget.ListView list, int index) {
    java.util.List<java.lang.String> thoughtsArraylist = getList("All");
    java.lang.String indexFavorited = splitOneEntryLine(thoughtsArraylist.get(indexLongClicked))[10];
    if (indexFavorited.equals("true")) {
        replaceFavoritedInThoughtsList(thoughtsArraylist, indexLongClicked, "false");
    }else {
        replaceFavoritedInThoughtsList(thoughtsArraylist, indexLongClicked, "true");
    }
}