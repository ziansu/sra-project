public int getRadiusByEventID(java.lang.String eventID) {
    int radius = 0;
    try {
        connect();
        statement.execute("USE GIS_DB;");
        java.sql.ResultSet rs = statement.executeQuery((("SELECT * FROM decisionTable WHERE eventID='" + eventID) + "';"));
        radius = rs.getInt("radius");
    } catch (java.sql.SQLException se) {
        se.printStackTrace();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    } finally {
        disconnect();
    }
    return radius;
}