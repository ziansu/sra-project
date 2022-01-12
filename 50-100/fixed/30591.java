public void populateSetDate(int year, int month, int day) {
    date1 = (((month + "/") + day) + "/") + year;
    android.widget.TextView tvDate = ((android.widget.TextView) (findViewById(R.id.tvDate)));
    tvDate.setText(date1);
}