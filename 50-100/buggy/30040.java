@java.lang.Override
public void onEventsLoaded() {
    android.util.Log.d("MESSAGE", "Events loaded");
    initializeDateViewPager();
    updateCalendarViewPager();
    previousView = null;
    dateViewPager.setCurrentItem(((selectedDay) - 1));
    syncProgressBar.dismiss();
    android.widget.Toast.makeText(getApplicationContext(), "Synkronointi onnistui", Toast.LENGTH_SHORT).show();
}