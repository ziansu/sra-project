public long countActionsBetween(org.joda.time.DateTime startDate, org.joda.time.DateTime endDate, de.dbaelz.onofftracker.models.Action.ActionType type) {
    try {
        return actionDao.queryBuilder().where().eq(TABLE_ACTIONTYPE, type).and().between(TABLE_DATE, startDate.toDate(), endDate.toDate()).countOf();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
        return 0;
    }
}