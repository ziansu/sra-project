private void populateSongListWithCategory(java.lang.String categoryKeyword) {
    com.flynn.jake.freeformplayer.database.MediaDataSource dataSource = new com.flynn.jake.freeformplayer.database.MediaDataSource(this.getApplicationContext());
    java.util.ArrayList<java.lang.String> tempArtistList = dataSource.readCategory(categoryKeyword);
    java.util.ArrayList<java.lang.String> newList = new java.util.ArrayList<java.lang.String>();
    for (java.lang.String s : tempArtistList) {
        newList.add(s);
    }
    android.widget.ArrayAdapter<java.lang.String> songArrayAdapter = new android.widget.ArrayAdapter<java.lang.String>(this, android.R.layout.simple_list_item_1, newList);
    mListView.setAdapter(songArrayAdapter);
}