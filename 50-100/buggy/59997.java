public void setPayout(double payout) {
    int id = this.getId();
    try {
        java.sql.PreparedStatement stmt = connection.prepareStatement("UPDATE bets SET winnings = ? WHERE id = ?;");
        stmt.setInt(1, status);
        stmt.setDouble(2, payout);
        stmt.executeUpdate();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
        return ;
    }
}