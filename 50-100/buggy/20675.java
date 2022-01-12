@java.lang.Override
public void onChildRemoved(com.google.firebase.database.DataSnapshot dataSnapshot) {
    for (int index = 0; index < (com.dsa.rimpark.MainActivity.dataSnapshotList.size()); index++) {
        if (com.dsa.rimpark.MainActivity.dataSnapshotList.get(index).getKey().equals(dataSnapshot.getKey())) {
            com.dsa.rimpark.MainActivity.dataSnapshotList.remove(index);
            eventsListAdaper.notifyDataSetChanged();
        }
    }
}