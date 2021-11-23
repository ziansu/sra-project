public org.softclicker.server.entity.Question getQuestionById(int questionId) throws java.sql.SQLException {
    java.lang.String sql = "SELECT * FROM `QUESTION` as q,`USER` as u WHERE q.OWNER_ID=u.USER_ID AND QUESTION_ID=?";
    try (java.sql.Connection conn = scopingDataSource.getConnection();java.sql.PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setInt(1, questionId);
        try (java.sql.ResultSet rs = stmt.executeQuery()) {
            org.softclicker.server.entity.User owner = org.softclicker.server.dao.DAOUtil.loadUser(rs);
            return org.softclicker.server.dao.DAOUtil.loadQuestion(rs, owner);
        }
    }
}