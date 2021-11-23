public void setIdCardInDB(int idCardInDB) {
    DataBase.DBData.connect = DB.getConnection();
    try {
        statement = DataBase.DBData.connect.createStatement();
        statement.executeUpdate(("update listcollection.display_of_collection set lastCard= " + idCardInDB));
        statement.close();
        closeResultSet();
        DB.closeDBConnection();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}