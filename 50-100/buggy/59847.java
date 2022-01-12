private java.util.ArrayList<java.lang.Integer> getSelectedDays() {
    days.clear();
    for (int i = 0; i < (tgWeekDays.length); i++) {
        if (tgWeekDays[i].isChecked()) {
            days.add(java.lang.Integer.parseInt(tgWeekDays[i].getTag().toString()));
            android.util.Log.e("tag added", tgWeekDays[i].getTag().toString());
        }
    }
    return days;
}