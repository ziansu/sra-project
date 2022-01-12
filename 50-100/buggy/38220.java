public void onInfoWindowClick(com.google.android.gms.maps.model.Marker marker) {
    com.google.android.gms.maps.model.LatLng position = marker.getPosition();
    geonote.app.NoteInfo noteInfo = mNotesRepository.Notes.get(position);
    android.content.Intent myIntent = new android.content.Intent(currentActivity, geonote.app.Activity.NoteViewActivity.class);
    myIntent.putExtra("noteInfoExtra", noteInfo);
    currentActivity.startActivityForResult(myIntent, Constants.ACTIVITY_NOTE_VIEW);
}