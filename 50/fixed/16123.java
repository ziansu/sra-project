@java.lang.Override
protected void onPostExecute(java.util.List<java.util.Date> dates) {
    super.onPostExecute(dates);
    refreshDraftMonthlyTitle((dates == null ? 0 : dates.size()));
}