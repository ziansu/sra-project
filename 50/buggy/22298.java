public void deleteEmployee(java.lang.String Condition) {
    java.lang.String query = ("DELETE FROM employee WHERE " + Condition) + ";";
    java.sql.ResultSet rs = query(query);
}