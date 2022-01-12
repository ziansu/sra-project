@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    java.lang.String timelineName = tlFriends.get(position);
    android.content.Intent viewTimelineActivity = new android.content.Intent("com.keepingatimeline.kat.ViewTimeline");
    viewTimelineActivity.putExtra("Timeline Name", timelineName);
    viewTimelineActivity.putExtra("Timeline ID", tlTitles.get(position));
    startActivity(viewTimelineActivity);
}