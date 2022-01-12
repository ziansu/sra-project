public void deleteNutzer(java.lang.String eMail) {
    try {
        open();
        preparedStatement = connect.prepareStatement("DELETE FROM Nutzer WHERE eMail = ?");
        preparedStatement.setString(1, eMail);
        preparedStatement.executeUpdate();
    } catch (java.sql.SQLException e) {
        java.lang.System.out.println(e);
    } catch (java.lang.ClassNotFoundException e) {
        java.lang.System.out.println(e);
    } finally {
        close();
    }
}