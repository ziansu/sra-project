@java.lang.Override
public void onClick(android.view.View v) {
    com.onettm.directions.DirectionsApplication.getInstance().getLocationsManager().invalidate();
}