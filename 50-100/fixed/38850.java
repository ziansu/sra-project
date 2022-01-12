public void clearLastSeenEIDMarker() {
    for (int i = 0; i < (data.size()); i++) {
        if ((data.get(i).row_type) == (com.irccloud.android.fragment.MessageViewFragment.ROW_LASTSEENEID)) {
            com.irccloud.android.data.EventsDataSource.getInstance().deleteEvent(data.get(i).eid, buffer.bid);
            data.remove(i);
        }
    }
    if ((lastSeenEidMarkerPosition) > 0)
        lastSeenEidMarkerPosition = -1;
    
}