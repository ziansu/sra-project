public java.util.Map<java.lang.String, java.lang.String> values(java.sql.ResultSet resultSet) throws java.sql.SQLException {
    java.util.Map<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
    for (java.lang.String column : columnsList)
        map.put(column, java.lang.String.valueOf(resultSet.getObject(column)));
    
    return map;
}