@java.lang.Override
public boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker) {
    dartmouth.edu.dartreminder.data.Schedule schedule = ((dartmouth.edu.dartreminder.data.Schedule) (LocationList.get(java.lang.Integer.parseInt(marker.getTitle()))));
    historyTitle.setText(("Title: " + (schedule.getTitle())));
    historyNote.setText(("Note: " + (schedule.getNotes())));
    marker.showInfoWindow();
    return true;
}