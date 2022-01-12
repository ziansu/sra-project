@java.lang.Override
public void onChildChanged(com.google.firebase.database.DataSnapshot dataSnapshot, java.lang.String s) {
    com.neelakshbhatia.roome.Card newVal = dataSnapshot.getValue(com.neelakshbhatia.roome.Card.class);
    java.lang.String key = dataSnapshot.getKey();
    int index = mKeys.indexOf(key);
    cardList.set(index, newVal);
    adapter.notifyDataSetChanged();
}