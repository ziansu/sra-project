@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    int userDays = java.lang.Integer.parseInt(userDaysNumber);
    clearChart();
    searchSingleCurrencyLastRates(singleCurrencyCode, userDays, singleMidRate);
    android.util.Log.d(com.example.android.currencyobserver.ChartActivity.LOG_TAG, java.lang.String.valueOf(userDays));
}