protected void setupActivityListView(android.view.View gameUIView) {
    android.widget.ListView activities = ((android.widget.ListView) (gameUIView.findViewById(R.id.EventsList)));
    eventsListAdapter = new polymorphs.a301.f17.cs414.thexgame.ActivityListAdapter(gameUIView.getContext(), R.layout.activity_item, events);
    activities.setAdapter(eventsListAdapter);
    eventsListAdapter.notifyDataSetChanged();
    activities.setDivider(null);
    activities.setDividerHeight(10);
}