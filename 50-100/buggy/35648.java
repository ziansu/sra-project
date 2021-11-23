@java.lang.Override
public void onItemLongClick(android.view.View view, int position) {
    refresh();
    changeDeleteMode(true);
    com.example.notepad.MyAdapter.ViewHolder viewHolder = new com.example.notepad.MyAdapter.ViewHolder(view);
    viewHolder.checkBox.setChecked(true);
    android.content.ContentValues contentValues = new android.content.ContentValues();
    contentValues.put("isChecked", true);
    int id = datalist.get(position).getId();
    org.litepal.crud.DataSupport.update(com.example.notepad.Note.class, contentValues, id);
    refresh();
    myAdapter.notifyDataSetChanged();
    com.example.notepad.NoteList.isDeleteMode = true;
}