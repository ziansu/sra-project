@java.lang.Override
public void onClick(android.view.View v) {
    if (!(view.isChecked())) {
        view.setChecked(true);
        day.isChecked = true;
        if ((dayClickListener) != null) {
            dayClickListener.onDayClicked(day, view);
        }
        android.util.Log.i(TAG, ("Clicked: " + (day.toString())));
    }
}