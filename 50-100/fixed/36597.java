public metier.Oeuvrevente find(int id) {
    metier.Oeuvrevente oeuvrevente = null;
    try {
        java.lang.String query = "select * from oeuvrevente where id_oeuvrevente=?";
        java.sql.PreparedStatement preparedStatement = conn.prepareStatement(query);
        preparedStatement.setInt(1, id);
        java.sql.ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            oeuvrevente = this.buildDomainObject(resultSet);
        }
        preparedStatement.close();
        resultSet.close();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return oeuvrevente;
}