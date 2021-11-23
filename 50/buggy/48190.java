@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    android.util.Log.d("woo", "data change");
    edu.rosehulman.punttj.rosebuckets.model.SubItem item = dataSnapshot.getValue(edu.rosehulman.punttj.rosebuckets.model.SubItem.class);
    onSubItemSelected(item);
}