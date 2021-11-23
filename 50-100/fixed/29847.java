private static android.content.UriMatcher buildUriMatcher() {
    final android.content.UriMatcher matcher = new android.content.UriMatcher(android.content.UriMatcher.NO_MATCH);
    final java.lang.String authority = ScheduleContract.CONTENT_AUTHORITY;
    matcher.addURI(authority, ScheduleContract.PATH_SCHEDULE, com.github.xzwj87.todolist.schedule.data.provider.ScheduleProvider.SCHEDULE);
    matcher.addURI(authority, ((ScheduleContract.PATH_SCHEDULE) + "/#"), com.github.xzwj87.todolist.schedule.data.provider.ScheduleProvider.SCHEDULE_WITH_ID);
    return matcher;
}