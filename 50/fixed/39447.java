public void update() throws java.io.IOException, java.lang.ClassNotFoundException, java.sql.SQLException, org.manalith.ircbot.plugin.newCER.Exceptions.FileDoesntSpecifiedException {
    boolean data = this.checkLocalLastRoundExpired();
    if (data) {
        this.updateLastRound();
        this.updateDataTable();
    }
}