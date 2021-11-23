@java.lang.Override
public com.accenture.spring.batch.test.Report mapRow(java.sql.ResultSet rs, int rowNum) throws java.sql.SQLException {
    com.accenture.spring.batch.test.Report report = new com.accenture.spring.batch.test.Report();
    report.setRefId(rs.getInt("refid"));
    report.setName(rs.getString("name"));
    report.setAge(rs.getInt("age"));
    report.setIncome(rs.getString("income"));
    return report;
}