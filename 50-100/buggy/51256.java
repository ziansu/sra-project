public java.util.ArrayList<java.lang.String> getScenarioIds() {
    java.lang.String query = "SELECT id FROM scenarios";
    java.util.ArrayList<java.lang.String> output = new java.util.ArrayList<>();
    try {
        java.sql.Statement statement = connection.createStatement();
        java.sql.ResultSet result = statement.executeQuery(query);
        do {
            output.add(result.getString(1));
        } while (result.next() );
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return output;
}