public void deleteStop(mprog.nl.bustimer.Stop stop) {
    if (dbHelper.inDatabase(stop)) {
        dbHelper.deleteStop(stop);
        savedStops = dbHelper.getStops();
        updateListView();
    }
}