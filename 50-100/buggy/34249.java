public boolean spellExists(int spellId) throws java.sql.SQLException {
    try (java.sql.Connection connection = dataSourceManager.getConnection("world")) {
        java.sql.PreparedStatement spellExists = connection.prepareStatement("SELECT id FROM spells WHERE id = ?");
        spellExists.setInt(1, spellId);
        try (java.sql.ResultSet resultSet = spellExists.executeQuery()) {
            return resultSet.next();
        }
    }
}