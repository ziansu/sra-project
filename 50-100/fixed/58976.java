private void closeConnection(de.rwth.dbis.acis.bazaar.service.dal.DALFacade dalFacade) {
    if (dalFacade == null)
        return ;
    
    java.sql.Connection dbConnection = dalFacade.getConnection();
    if (dbConnection != null) {
        try {
            dbConnection.close();
            java.lang.System.out.println("Database connection closed!");
        } catch (java.sql.SQLException ignore) {
            java.lang.System.out.println("Could not close db connection!");
        }
    }
}