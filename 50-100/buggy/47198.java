@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    if (!(isP2P())) {
        android.view.MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
    }
    selectedMenuItem = menu.findItem(R.id.action_meeting_room_hall);
    selectedMenuItem.setEnabled(false);
    return super.onCreateOptionsMenu(menu);
}