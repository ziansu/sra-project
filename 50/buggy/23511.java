public static com.wso2telco.dao.DBConnection getInstance() throws java.lang.ClassNotFoundException {
    if ((com.wso2telco.dao.DBConnection.instance) == null) {
        try {
            com.wso2telco.dao.DBConnection.instance = new com.wso2telco.dao.DBConnection();
        } catch (java.sql.SQLException | com.wso2telco.core.dbutils.DBUtilException e) {
            com.wso2telco.dao.DBConnection.logger.error("Error occurred while getting connection");
        }
    }
    return com.wso2telco.dao.DBConnection.instance;
}