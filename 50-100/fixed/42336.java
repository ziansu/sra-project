private void getClubEvents(polyclubsconsole.Club club) {
    java.util.ArrayList<polyclubsconsole.Event> events = club.getEvents();
    for (int iter = 0; iter < (events.length()); iter++) {
        events.get(iter).printEventInfo();
    }
}