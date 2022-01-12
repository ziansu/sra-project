@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.content.Intent favoriteToDetailIntent = new android.content.Intent(this, com.example.emiliaaxen.stockholmguide1.DetailActivity.class);
    favoriteCursor.moveToPosition(position);
    favoriteToDetailIntent.putExtra(MainActivity.KEY_FAVORITES, favoriteCursor.getInt(favoriteCursor.getColumnIndex(NeighborhoodSQLiteOpenHelper.COL_ID)));
    startActivity(favoriteToDetailIntent);
}