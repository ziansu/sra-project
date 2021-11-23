public void setStmtInsertClaimants() {
    try {
        this.stmtInsertClaimants = this.dbConnection.prepareStatement(("INSERT INTO APP.CLAIMANTS" + ("(LASTNAME, FIRSTNAME, MIDDLENAME, WORKPLACE, STATE) VALUES" + "(?,?,?,?,?)")), java.sql.PreparedStatement.RETURN_GENERATED_KEYS);
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}