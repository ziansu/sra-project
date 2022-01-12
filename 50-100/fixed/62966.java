@java.lang.Override
public void onDoubleClick(android.view.View v, int position) {
    at.tugraz.inffeldgroup.dailypic.db.UriWrapper uri = uriList.get(position);
    at.tugraz.inffeldgroup.dailypic.FavouriteHandler.toggleFavouriteState(this, uri);
    java.util.ArrayList<at.tugraz.inffeldgroup.dailypic.db.UriWrapper> uriListNew = at.tugraz.inffeldgroup.dailypic.db.DbDatasource.getInstance(this).getAllFavorites();
    gridAdapter.setNewImages(uriListNew);
    uriList = uriListNew;
}