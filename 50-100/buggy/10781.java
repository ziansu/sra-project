public boolean onMenuItemClick(android.view.MenuItem menuItem) {
    ticketList.add(new Data.Ticket("00:00", menuItem.getTitle().toString()));
    ticketList.add(new Data.Ticket("00:00", menuItem.getTitle().toString()));
    setAdapter();
    userData.setTicketList(ticketList);
    applicationTimeTracker.setUserData(userData);
    adapter.notifyDataSetChanged();
    return true;
}