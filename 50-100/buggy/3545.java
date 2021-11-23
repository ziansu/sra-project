private int getNewValue(android.content.Context context) {
    int sumInflows = getSumInflows(context);
    int sumOutflows = getSumOutflows(context);
    int amountBudgeted = getAmountBudgeted(context);
    int amountSaved = java.lang.Math.round(((sumInflows - amountBudgeted) * (MainActivity.sharedVals.getFloat(MainActivity.PERCENT_SAVE, 0))));
    switch (name) {
        case com.example.kevdub.moneytracker.MainActivity.SPEND_MONEY :
            return (sumInflows - amountSaved) - sumOutflows;
        case com.example.kevdub.moneytracker.MainActivity.SAVE_MONEY :
            return amountSaved;
        case com.example.kevdub.moneytracker.MainActivity.TOT_MONEY :
            return sumInflows - sumOutflows;
        default :
            return -1;
    }
}