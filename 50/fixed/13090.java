public rx.Observable<com.insuranceline.data.vo.DailySummary> getDailySummaryFromDb() {
    return mDatabaseHelper.getDailySummaryObservable();
}