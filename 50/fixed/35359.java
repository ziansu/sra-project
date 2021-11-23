public static void handleIfFirstExecution(java.util.Set<java.lang.String> bids) {
    if (money.mezu.mezu.BudgetsDownloadedNotifier.firstExecution) {
        new money.mezu.mezu.BudgetsDownloadedNotifier(bids);
    }
    money.mezu.mezu.BudgetsDownloadedNotifier.firstExecution = false;
}