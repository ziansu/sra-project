public void init() {
    try {
        java.util.ArrayList<java.util.ArrayList<java.lang.String>> last_id = place_bet.ExecuteQuery("SELECT max(BetID) FROM bets;");
        if ((last_id.get(0).get(0)) != null)
            this.CurrentBetID = java.lang.Long.parseLong(last_id.get(0).get(0));
        
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}