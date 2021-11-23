@java.lang.Override
public void onClick(android.view.View v) {
    if (MainActivity.schedule.add(((dayWeek) + 1), from_hours.getValue(), from_minutes.getValue(), to_hours.getValue(), to_minutes.getValue())) {
        closeDialog();
    }else {
        android.widget.Toast temp = android.widget.Toast.makeText(c.getBaseContext(), "This interval is incorrect!", Toast.LENGTH_SHORT);
        temp.show();
    }
}