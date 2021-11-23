private void requestDeparture() {
    journeyPlanner.getDepartureBoard(this, java.util.Calendar.getInstance(), stopLocation);
    departureSwipeRefreshLayout.setRefreshing(true);
}