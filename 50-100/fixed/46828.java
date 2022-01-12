@java.lang.Override
public java.lang.String mapRow(java.sql.ResultSet resultSet, int i) throws java.sql.SQLException {
    java.lang.String idNameStr = "";
    idNameStr = ((resultSet.getString("id")) + ",") + (resultSet.getString("technology").toLowerCase().trim());
    return idNameStr;
}