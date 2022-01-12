@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String EventName;
    EventName = eventName.getText().toString();
    if (EventName.isEmpty()) {
        android.widget.Toast.makeText(context, "Please enter a Name for the event", Toast.LENGTH_LONG).show();
    }else {
        android.widget.Toast.makeText(context, EventName, Toast.LENGTH_SHORT).show();
    }
}