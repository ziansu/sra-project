java.lang.String[] parsingDate(java.lang.String nextEpisodedate) {
    java.lang.String[] date = nextEpisodedate.split("-");
    android.util.Log.d("CALENDAR", ("ParseDate: " + date));
    return date;
}