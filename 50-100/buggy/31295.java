public int getMinUnitPrice() {
    int min = java.lang.Integer.MAX_VALUE;
    try {
        for (java.lang.Integer id : wares) {
            java.sql.ResultSet rs = sample.SQLHandler.executeQuery(("SELECT * FROM WARE WHERE WID=" + id));
            if (rs.next()) {
                min += java.lang.Math.min(rs.getInt("price"), min);
            }
        }
    } catch (java.lang.Exception ex) {
        java.lang.System.out.println("get min error!");
    }
    if (min == (java.lang.Integer.MAX_VALUE))
        return 0;
    
    return min;
}