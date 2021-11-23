public int getMaxUnitPrice() {
    int max = java.lang.Integer.MIN_VALUE;
    try {
        for (java.lang.Integer id : wares) {
            java.sql.ResultSet rs = sample.SQLHandler.executeQuery(("SELECT * FROM WARE WHERE WID=" + id));
            if (rs.next()) {
                max += java.lang.Integer.max(max, rs.getInt("price"));
            }
        }
    } catch (java.lang.Exception ex) {
        java.lang.System.out.println("get total max error!");
    }
    return max;
}