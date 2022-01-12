public static void setAmountGivenIngredientId(int ingredientId, double amount) {
    try (java.sql.Connection connection = no.ntnu.iie.stud.cateringstorm.database.Database.getConnection()) {
        try (java.sql.PreparedStatement statement = connection.prepareStatement("UPDATE ingredient SET amount = ? WHERE ingredient_id = ?")) {
            statement.setInt(1, ingredientId);
            statement.setDouble(2, amount);
            statement.execute();
        }
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}