private void initListData() {
    java.sql.ResultSet rs = util.HandleDB.queryDB(HandleDB.SELECT_BASIS_CATTLE);
    try {
        while (rs.next()) {
            java.lang.String id = rs.getString("idOfCattle");
            java.lang.String features = rs.getString("feature");
            util.Cattle cattle = new util.Cattle(id, features);
            cattleVector.add(cattle);
        } 
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}