public Data.Schedule getNextSchedule(java.lang.String name) {
    try {
        result = statement.executeQuery((("SELECT ScheduleID FROM schedule WHERE ScheduleName='" + name) + "'"));
        for (int x = 0; x <= (currentScheduleRow); x++) {
            result.next();
        }
        return new Data.Schedule(dbc, result.getString(1));
    } catch (java.sql.SQLException e) {
        report(e);
        return null;
    }
}