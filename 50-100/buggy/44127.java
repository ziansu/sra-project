private java.lang.Object[] createObj(java.sql.ResultSet res) throws java.lang.Exception {
    java.lang.Object[] obj = new java.lang.Object[5];
    obj[0] = res.getInt("sub_id");
    obj[1] = res.getString("name");
    obj[2] = res.getString("date_to");
    obj[3] = res.getString("date_from");
    obj[4] = res.getInt("sub_type");
    return obj;
}