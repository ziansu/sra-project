public de.dbsys.model.Kunde createKunde(final java.sql.ResultSet set) {
    try {
        de.dbsys.model.Kunde kd = new de.dbsys.model.Kunde(set.getString("vorname"), set.getString("nachname"), set.getString("mailadresse"), set.getString("passwort"), set.getString("IBAN"), set.getString("bic"), null);
        return kd;
    } catch (java.sql.SQLException e) {
        java.lang.System.err.println("Exception while creating 'kunde' from ResultSet");
        handleSQLException(e);
        throw new java.lang.RuntimeException(e);
    }
}