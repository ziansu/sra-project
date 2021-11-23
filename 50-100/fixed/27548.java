public boolean purchaseGame(int GameId) {
    if ((creditCard) == null) {
        return false;
    }
    try {
        java.sql.PreparedStatement s = c.prepareStatement("INSERT INTO OWNS VALUES(?,?)");
        s.setInt(1, GameId);
        s.setInt(2, id);
        if (s.execute())
            return true;
        else
            return false;
        
    } catch (java.sql.SQLException e) {
        java.lang.System.err.println(e);
    }
    return false;
}