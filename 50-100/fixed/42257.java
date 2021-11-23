public void setDate(int y, int m, int d) {
    mSelectedYear = y;
    mSelectedMonth = m;
    mSelectedDate = d;
    android.widget.Button date = ((android.widget.Button) (findViewById(R.id.setDate)));
    date.setText(((((("Date: " + (java.lang.Integer.toString((m + 1)))) + "-") + (java.lang.Integer.toString(d))) + "-") + (java.lang.Integer.toString(y))));
}