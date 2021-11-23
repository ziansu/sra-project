public void setCurrentDate(int day, int month, int year) {
    if ((monthRv) == null) {
        this.day = day;
        this.year = year;
        this.month = month;
    }else {
        new gr.kokeroulis.androiddatetime.AsyncTaskHelper(month, monthRv).execute(monthAdapter);
        new gr.kokeroulis.androiddatetime.AsyncTaskHelper(year, yearRv).execute(yearAdapter);
        updateDayAdapter(day, month, year, true);
    }
}