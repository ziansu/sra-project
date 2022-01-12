@java.lang.Override
protected void listItemClicked(int position) {
    if (position != 0) {
        edu.mit.mitmobile2.shuttles.model.MITShuttleStopWrapper stop = adapter.getItem((position - 1));
        android.content.Intent intent = new android.content.Intent(getActivity(), edu.mit.mitmobile2.shuttles.activities.ShuttleStopActivity.class);
        intent.putExtra(Constants.ROUTE_ID_KEY, routeId);
        intent.putExtra(Constants.STOP_ID_KEY, stop.getId());
        startActivity(intent);
    }
}