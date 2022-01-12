public void sos(int idUser, int idContact, double x, double y) {
    try {
        com.example.hjk.testing.WorkWithDataBase.connection = com.example.hjk.testing.WorkWithDataBase.setInstance();
        java.sql.Statement statement = com.example.hjk.testing.WorkWithDataBase.connection.createStatement();
        statement.execute((((((((((("call sos_ (" + idUser) + ",") + idContact) + ",") + 0) + ",") + x) + ",") + y) + ")"));
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}