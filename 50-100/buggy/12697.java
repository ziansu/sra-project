private void refreshList() {
    listView = ((android.widget.ListView) (findViewById(R.id.mushroom_list_view)));
    bazinac.aplikacenahouby.db.AplikaceNaHoubyDBHelper database = new bazinac.aplikacenahouby.db.AplikaceNaHoubyDBHelper(getApplicationContext());
    bazinac.aplikacenahouby.db.MushroomHelper mush = new bazinac.aplikacenahouby.db.MushroomHelper();
    mushList = mush.getMushrooms(database.getReadableDatabase(), foundMushroomIDs, activeMinorSignValues);
    atlasAdapter = new bazinac.aplikacenahouby.adapters.MushroomListAdapter(this, mushList);
    listView.setAdapter(atlasAdapter);
}