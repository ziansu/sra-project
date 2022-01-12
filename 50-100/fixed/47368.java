public void deleteNutzer(final java.lang.String eMail) {
    try {
        open();
        this.preparedStatement = this.connect.prepareStatement("DELETE FROM Nutzer WHERE eMail = ?");
        this.preparedStatement.setString(1, eMail);
        this.preparedStatement.executeUpdate();
    } catch (final java.sql.SQLException e) {
        java.lang.System.out.println(e);
    } catch (final java.lang.ClassNotFoundException e) {
        java.lang.System.out.println(e);
    } finally {
        close();
    }
}