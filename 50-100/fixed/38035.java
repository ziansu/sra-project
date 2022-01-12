public void refresh() {
    saveWord.clear();
    android.database.Cursor wordData = cr.query(DBURI, null, null, null, null);
    while (wordData.moveToNext()) {
        saveWord.add(wordData.getString(1));
    } 
    if ((saveWord.size()) <= 0) {
        saveWord.add("Data not found");
    }
    screen.setAdapter(adapter);
    wordData.close();
}