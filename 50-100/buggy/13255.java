@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.database.Cursor cursor = ((android.database.Cursor) (parent.getItemAtPosition(position)));
    if ((cursor.getCount()) > 0) {
        com.hamster.translaterapp.data.TranslateDataItem translateDataItem = new com.hamster.translaterapp.data.TranslateDataItem(cursor);
        com.hamster.translaterapp.data.TranslaterModel.getIstance().setTranslate(translateDataItem, false, true);
    }
}