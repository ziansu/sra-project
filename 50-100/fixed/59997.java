public void setPayout(double payout) {
    int id = this.getId();
    try {
        java.sql.PreparedStatement stmt = connection.prepareStatement("UPDATE bets SET winnings = ? WHERE id = ?;");
        stmt.setDouble(1, payout);
        stmt.setInt(2, id);
        stmt.executeUpdate();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
        return ;
    }
}