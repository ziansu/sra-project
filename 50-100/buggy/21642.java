@java.lang.Override
public void createRaavareBatch(DTO.RaavareBatchDTO raavarebatch) throws interfaces.DALException {
    query = "select * from raavarebatch where rb_id =" + (raavarebatch.getRbID());
    java.sql.ResultSet result = c.doQuery(query);
    if (result != null) {
        java.lang.System.out.println("RB_ID already exsists");
    }else {
        query = ((((("Call opret_raavarebatch(" + (raavarebatch.getRbID())) + ", ") + (raavarebatch.getRaavareID())) + ", ") + (raavarebatch.getMaengde())) + ")";
        c.doQuery(query);
    }
}