@java.lang.Override
public void onHourSelected(int mHour) {
    hourSelected = mHour;
    hour.add(hourSelected);
    for (int hours : hour) {
        android.util.Log.i("Hours: ", java.lang.String.valueOf(hour));
    }
}