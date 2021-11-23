public java.util.List<model.Nutzer> getAllNutzer() {
    try {
        open();
        preparedStatement = connect.prepareStatement("SELECT * FROM Nutzer");
        resultSet = preparedStatement.executeQuery();
        return getNutzerFromResultSet(resultSet);
    } catch (java.sql.SQLException e) {
        java.lang.System.out.println(e);
        return null;
    } catch (java.lang.ClassNotFoundException e) {
        java.lang.System.out.println(e);
        return null;
    } finally {
        close();
    }
}