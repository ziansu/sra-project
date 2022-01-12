@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    com.example.duanli.student_portal.ListCell selectedRecipe = eventList.get(position);
    android.content.Intent detailIntent = new android.content.Intent(getContext(), com.example.duanli.student_portal.EventDetailActivity.class);
    detailIntent.putExtra("title", selectedRecipe.title);
    eventId = selectedRecipe.id;
    detailIntent.putExtra("eventId", eventId);
    startActivity(detailIntent);
}