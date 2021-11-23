public java.util.List<java.lang.String> mapRow(java.sql.ResultSet rs, int rowNum) throws java.sql.SQLException {
    java.util.List<java.lang.String> list = new java.util.ArrayList<>();
    list.add(rs.getString(1));
    return list;
}