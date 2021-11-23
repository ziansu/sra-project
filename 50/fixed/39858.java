@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    findAttendees(query);
    return true;
}