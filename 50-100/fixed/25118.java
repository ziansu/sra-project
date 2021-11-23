public void addAmenity(java.lang.String desc, double price) {
    int result = 0;
    try {
        addAmenity.setString(1, desc);
        addAmenity.setDouble(2, price);
        addAmenity.executeUpdate();
    } catch (java.sql.SQLException sqlException) {
        sqlException.printStackTrace();
    }
}