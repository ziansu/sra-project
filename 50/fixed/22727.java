public void showRateDay() {
    hirondelle.date4j.DateTime today = hirondelle.date4j.DateTime.today(java.util.TimeZone.getDefault());
    showRateDayPopup(today);
}