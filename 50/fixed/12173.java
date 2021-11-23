@java.lang.Override
public void onChildAdded(com.google.firebase.database.DataSnapshot dataSnapshot, java.lang.String s) {
    com.example.musedroid.musedroid.Museum museum = dataSnapshot.getValue(com.example.musedroid.musedroid.Museum.class);
    museumAdapter.add(museum);
    museumAdapter.notifyDataSetChanged();
}