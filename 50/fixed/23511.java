public static com.wso2telco.dao.DBConnection getInstance() throws java.lang.ClassNotFoundException {
    if ((com.wso2telco.dao.DBConnection.instance) == null) {
        com.wso2telco.dao.DBConnection.instance = new com.wso2telco.dao.DBConnection();
    }
    return com.wso2telco.dao.DBConnection.instance;
}