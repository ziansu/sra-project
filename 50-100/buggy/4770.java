public void onNothingSelected(android.widget.AdapterView parent) {
    setInsurance_enddate(((((((getInsurance_startdate().getDayOfMonth()) + "/") + (getInsurance_startdate().getMonth())) + "/") + (getInsurance_startdate().getYear())) + 1));
    android.util.Log.e("Insurance End Date", getInsurance_enddate());
    android.util.Log.e("Cover Period", "Index changed to do nothing");
}