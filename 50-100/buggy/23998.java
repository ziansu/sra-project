@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
    for (com.firebase.client.DataSnapshot postMaps : dataSnapshot.getChildren()) {
        android.util.Log.e("MAP", java.lang.String.valueOf(postMaps.getValue()));
        com.inveitix.android.clue.cmn.MuseumMap map = postMaps.getValue(com.inveitix.android.clue.cmn.MuseumMap.class);
        android.util.Log.e("MAP", ("MuseumID: " + (java.lang.String.valueOf(map.getMuseumId()))));
        listenre.onMuseumDownloaded(map);
    }
}