@java.lang.Override
public java.lang.Boolean doInPreparedStatement(java.sql.PreparedStatement ps) throws java.sql.SQLException, org.springframework.dao.DataAccessException {
    ps.setLong(1, job.id);
    ps.setString(2, job.name);
    ps.setString(3, job.description);
    ps.setInt(4, job.repeatCount);
    ps.setInt(5, job.interval);
    ps.setTimestamp(6, job.startTime);
    ps.setTimestamp(7, job.endTime);
    return ps.execute();
}