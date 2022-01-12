@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    android.util.Log.i(TAG, dataSnapshot.toString());
    for (com.google.firebase.database.DataSnapshot locSnap : dataSnapshot.getChildren()) {
        java.lang.String location = locSnap.getValue(java.lang.String.class);
        mPostLocations.add(location);
    }
    mFilteredLocationNames = new java.util.ArrayList<>(mPostLocations);
    mFilteredItemsLV.setAdapter(new com.example.sammengistu.stuckapp.adapters.FilterListAdapter(mFilteredLocationNames, getActivity()));
}