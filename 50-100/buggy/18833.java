private void populateCalenderWithEvents(com.roomorama.caldroid.CaldroidFragment calendar) {
    for (int i = 0; i < (EventFeed.usersEvents.size()); i++) {
        java.util.Date eventDate = new java.util.Date(((EventFeed.usersEvents.get(i).getStartTimeTimestamp()) * (cs.lmu.grapevine.entities.Event.MILLISECONDS_PER_SECOND)));
        calendar.setBackgroundResourceForDate(R.color.event_highlight, eventDate);
    }
    calendar.refreshView();
}