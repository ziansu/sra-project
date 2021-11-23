public java.lang.String[] getCode(java.util.UUID uuid) {
    java.sql.PreparedStatement state = db.prepareStatement(getCode);
    try {
        state.setString(1, uuid.toString());
        java.sql.ResultSet set = state.executeQuery();
        return set.next() ? new java.lang.String[]{ "" + (set.getInt("code")) , set.getString("reddit_name") } : null;
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return null;
}