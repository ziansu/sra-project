public void setStmtInsertClaimants() {
    this.stmtInsertClaimants = "INSERT INTO APP.CLAIMANTS" + ("(LASTNAME, FIRSTNAME, MIDDLENAME, WORKPLACE, STATE) VALUES" + "(?,?,?,?,?)");
}