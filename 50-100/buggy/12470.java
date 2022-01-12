@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View viewClicked, int position, long id) {
    com.aolalabs.partywolf.Event clickedEvent;
    if (dateView) {
        clickedEvent = events.get(position);
    }else {
        clickedEvent = sortedEvents.get(position);
    }
    java.lang.String message = "You clicked on " + (clickedEvent.getTitle());
    java.lang.System.out.println(message);
    android.content.Intent i = new android.content.Intent(this, com.aolalabs.partywolf.EventDetailA.class);
    i.putExtra("event", clickedEvent);
    startActivity(i);
}