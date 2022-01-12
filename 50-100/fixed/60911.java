private void updateInstanceID(org.json.simple.JSONObject obj) {
    try {
        sql = "UPDATE Users SET instanceID = ? WHERE googleID = ?";
        ps = conn.prepareStatement(sql);
        ps.setString(1, ((java.lang.String) (obj.get("instanceID"))));
        ps.setString(2, ((java.lang.String) (obj.get("googleID"))));
        java.lang.System.out.println(ps);
        ps.execute();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}