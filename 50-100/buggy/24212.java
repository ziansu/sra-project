@java.lang.Override
public void onClick(android.view.View view) {
    int position = 0;
    java.lang.String itemTag = editTag.getText().toString();
    editTag.setText("");
    list.add(position, ("#" + itemTag));
    tagdb.insertTag(new com.example.vlad.scruji.Main_Screen_With_Tabs.Models.MyTag(pref.getString(Constants.UNIQUE_ID, ""), itemTag));
    adapter.notifyItemInserted(position);
    rv.scrollToPosition(position);
    android.util.Log.d("TAG+", ("Tag was inserted: " + itemTag));
}