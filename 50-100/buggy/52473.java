private void loadLastPositions(java.util.List<org.droidplanner.android.utils.file.IO.TLogReader.Event> logEvents) {
    org.droidplanner.android.activities.LocatorActivity.lastPositions.clear();
    for (org.droidplanner.android.utils.file.IO.TLogReader.Event event : logEvents) {
        final com.MAVLink.common.msg_global_position_int message = ((com.MAVLink.common.msg_global_position_int) (event.getMavLinkMessage()));
        if (((message.lat) != 0) || ((message.lon) != 0))
            org.droidplanner.android.activities.LocatorActivity.lastPositions.add(0, message);
        
    }
    setSelectedMsg(null);
    locatorListFragment.notifyDataSetChanged();
    updateInfo();
}