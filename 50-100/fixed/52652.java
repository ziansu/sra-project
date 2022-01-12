public java.util.List<model.Nutzer> getAllNutzer() {
    try {
        open();
        this.preparedStatement = this.connect.prepareStatement("SELECT * FROM Nutzer");
        this.resultSet = this.preparedStatement.executeQuery();
        return getNutzerFromResultSet(this.resultSet);
    } catch (final java.sql.SQLException e) {
        java.lang.System.out.println(e);
        return null;
    } catch (final java.lang.ClassNotFoundException e) {
        java.lang.System.out.println(e);
        return null;
    } finally {
        close();
    }
}