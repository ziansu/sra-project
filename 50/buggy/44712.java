@java.lang.Override
public void onEventClick(com.alamkanak.weekview.WeekViewEvent event, android.graphics.RectF eventRect) {
    android.widget.Toast.makeText(this, ("Clicked " + (event.getName())), Toast.LENGTH_SHORT).show();
}