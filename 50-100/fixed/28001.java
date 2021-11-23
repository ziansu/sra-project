public void onItemClick(android.widget.AdapterView parent, android.view.View v, int position, long id) {
    com.worldtreeinc.leaves.Event event = eventsListAdapter.getCurrentEvent(position);
    android.content.Intent intent = new android.content.Intent(activity.getApplicationContext(), com.worldtreeinc.leaves.EventDetailsActivity.class);
    intent.putExtra("OBJECT_ID", event.getObjectId());
    if (isPlanner) {
        intent.putExtra("IS_PLANNER", true);
    }else {
        intent.putExtra("IS_PLANNER", false);
    }
    activity.startActivity(intent);
}