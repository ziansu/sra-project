private void updateInstanceID(org.json.simple.JSONObject obj) {
    try {
        sql = "UPDATE Users SET instanceID = ? WHERE googleID = ?";
        ps = conn.prepareStatement(sql);
        ps.setString(1, ((java.lang.String) (obj.get("googleID"))));
        ps.setString(2, ((java.lang.String) (obj.get("instanceID"))));
        java.lang.System.out.println(ps);
        ps.execute();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}