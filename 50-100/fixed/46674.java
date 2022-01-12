@java.lang.Override
public java.lang.Boolean doInPreparedStatement(java.sql.PreparedStatement ps) throws java.sql.SQLException, org.springframework.dao.DataAccessException {
    ps.setString(1, job.name);
    ps.setString(2, job.description);
    ps.setInt(3, job.repeatCount);
    ps.setInt(4, job.interval);
    ps.setTimestamp(5, job.startTime);
    ps.setTimestamp(6, job.endTime);
    ps.setLong(7, job.id);
    return ps.execute();
}