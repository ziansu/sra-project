@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    int userDays = java.lang.Integer.parseInt(userDaysNumber);
    searchSingleCurrencyLastRates(singleCurrencyCode, userDays, singleMidRate);
}