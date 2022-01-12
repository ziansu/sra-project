public int getAvgTurnaroundTimeDao(java.util.Date startDate, java.util.Date endDate) {
    try {
        java.lang.Integer turnAroundTime = getJdbcTemplate().queryForObject(getStatement("stats.averageTurnAroundTime"), java.lang.Integer.class, startDate, endDate);
        return turnAroundTime == null ? 0 : turnAroundTime;
    } catch (org.springframework.dao.DataAccessException ex) {
        return 0;
    }
}