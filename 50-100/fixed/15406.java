public void checkLineGraphUISetting() {
    android.content.SharedPreferences sp = android.preference.PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
    lineGraphUISetting = sp.getBoolean("prefLineGraphUI", true);
    lineGraphView = findViewById(R.id.chart1);
    if (lineGraphUISetting)
        lineGraphView.setVisibility(View.VISIBLE);
    else
        lineGraphView.setVisibility(View.GONE);
    
}