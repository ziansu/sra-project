public void addEvent(android.view.View view) {
    if (organizer) {
        android.content.Intent addEvent = new android.content.Intent(this, com.sourcey.eventure.Events.EventActivity.class);
        android.os.Bundle extra = new android.os.Bundle();
        extra.putBoolean("organizer", organizer);
        addEvent.putExtras(extra);
        startActivity(addEvent);
    }else {
        android.widget.Toast.makeText(getApplicationContext(), "You aren't an organizer!", Toast.LENGTH_LONG).show();
    }
}