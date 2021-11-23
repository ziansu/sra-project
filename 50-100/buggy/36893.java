public java.lang.String addDev(objects.Device dev) {
    java.sql.PreparedStatement stmt = null;
    java.sql.Connection conn = null;
    java.lang.String sql = "INSERT INTO network " + "VALUES (?, '?', '?')";
    try {
        conn = dao.DeviceDao.getConnection();
        return new java.lang.String("Success");
    } catch (java.lang.Exception e) {
        return new java.lang.String(e.getMessage());
    }
}