@java.lang.Override
public void add(travelexperts.Item product) {
    try {
        conn = travelexperts.TravelExpertsDB.GetConnection();
        stmt = conn.createStatement();
        java.lang.String strSQL = ("Insert Into products (ProdName) Values('" + (product.getName())) + "')";
        if ((stmt.executeUpdate(strSQL)) == 0) {
            java.lang.System.out.println("no rows inserted");
        }
        conn.close();
    } catch (java.lang.Exception excp) {
        excp.printStackTrace();
    }
}