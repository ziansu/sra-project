public void setCurrentDate(int day, int month, int year) {
    new gr.kokeroulis.androiddatetime.AsyncTaskHelper(month, monthRv).execute(monthAdapter);
    new gr.kokeroulis.androiddatetime.AsyncTaskHelper(year, yearRv).execute(yearAdapter);
    updateDayAdapter(day, month, year, true);
}