@java.lang.Override
public org.smartdata.model.SystemInfo mapRow(java.sql.ResultSet resultSet, int i) throws java.sql.SQLException {
    org.smartdata.model.SystemInfo systemInfo = new org.smartdata.model.SystemInfo();
    systemInfo.setProperty(resultSet.getString("property"));
    systemInfo.setValue(resultSet.getString("value"));
    return systemInfo;
}