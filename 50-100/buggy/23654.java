private void getDateTime() {
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    java.text.SimpleDateFormat day_month_year = new java.text.SimpleDateFormat("dd-MMM-yyyy");
    java.text.SimpleDateFormat hr_min_sec = new java.text.SimpleDateFormat("h:mm a");
    java.lang.String date = day_month_year.format(calendar.getTime());
    java.lang.String time = hr_min_sec.format(calendar.getTime());
    android.util.Log.d("SUMMIT TIME --> ", (date + time));
}