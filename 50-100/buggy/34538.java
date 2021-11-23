public void onClick(android.view.View view) {
    btnCalculate.setEnabled(false);
    Calculate();
    android.content.Intent result = new android.content.Intent(getApplicationContext(), com.GBSnowDay.SnowDay.SnowDayResult.class);
    result.putExtra("dayrun", dayrun);
    result.putExtra("days", days);
    startActivity(result);
}