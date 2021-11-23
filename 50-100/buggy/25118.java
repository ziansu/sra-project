public int addAmenity(java.lang.String desc, double price) {
    int result = 0;
    try {
        addAmenity.setString(1, desc);
        addAmenity.setDouble(2, price);
        addAmenity.executeUpdate();
        java.sql.ResultSet rs = addAmenity.getGeneratedKeys();
        if (rs.next()) {
            result = rs.getInt(1);
        }
    } catch (java.sql.SQLException sqlException) {
        sqlException.printStackTrace();
    }
    return result;
}