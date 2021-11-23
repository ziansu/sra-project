private void clearOldDataInInterviewTable() throws java.sql.SQLException {
    java.lang.String sql = "delete from InterviewMaster";
    this.preparedStatement = this.connection.prepareStatement(sql);
    this.preparedStatement.executeUpdate();
}