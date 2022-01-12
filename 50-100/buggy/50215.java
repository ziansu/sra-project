@java.lang.Override
public void onSelectedDayChange(android.widget.CalendarView view, int year, int month, int dayOfMonth) {
    android.widget.LinearLayout pickupDateLayout = ((android.widget.LinearLayout) (findViewById(R.id.pickupDateContainer)));
    android.widget.EditText pickupDate = ((android.widget.EditText) (pickupDateLayout.findViewById(R.id.pickupDate)));
    pickupDate.setText(((((dayOfMonth + "-") + (month + 1)) + "-") + year));
    dialog.dismiss();
}