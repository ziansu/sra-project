@java.lang.Override
public void done(java.util.List<com.royalplate.royalplate.data.KidsMenuParse> kidsItems, com.parse.ParseException e) {
    kidsmenuAdapter = new com.royalplate.royalplate.adapter.KidsMenuAdapter(this, kidsItems);
    listview.setAdapter(kidsmenuAdapter);
    android.util.Log.e("name", " pass kidsItem");
}