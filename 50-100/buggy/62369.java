public boolean addPizza(java.lang.String name, int price, java.lang.String description) {
    try {
        java.sql.PreparedStatement pstmt = c.preparedStatement("INSERT INTO pizza (name, price, description) VALUES (?, ?, ?);");
        pstmt.setString(1, name);
        pstmt.setInt(2, price);
        pstmt.setString(3, description);
        pstmt.executeUpdate();
        return true;
    } catch (java.lang.Exception e1) {
        e1.printStackTrace();
    }
    return false;
}