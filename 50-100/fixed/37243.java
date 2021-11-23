public boolean deleteEmployee(int ID) throws java.sql.SQLException {
    java.lang.String deleteEmployee = "DELETE FROM anicolette.Employee WHERE IdNo=" + ID;
    try {
        java.sql.ResultSet rs = statement_.executeQuery(deleteEmployee);
    } catch (java.sql.SQLException sqlex) {
        sqlex.printStackTrace();
        throw sqlex;
    }
    return true;
}