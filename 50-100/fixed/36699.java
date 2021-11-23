protected void setupEventsListView(android.view.View notificationsView) {
    eventsList = ((android.widget.ListView) (notificationsView.findViewById(R.id.eventsListView)));
    for (int i = 0; i < 15; i++) {
        eventsData.add("Game won!");
    }
    eventListAdapter = new polymorphs.a301.f17.cs414.thexgame.EventListAdapter(notificationsView.getContext(), R.layout.event_item, eventsData);
    eventsList.setAdapter(eventListAdapter);
    eventListAdapter.notifyDataSetChanged();
    eventsList.setDivider(null);
    eventsList.setDividerHeight(10);
}