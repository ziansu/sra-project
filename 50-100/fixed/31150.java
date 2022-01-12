public boolean updateTopic(java.lang.String title, java.lang.String description, int topicId) throws java.lang.Exception {
    java.lang.String sql = "update `topic` set `title` = ? ,`description` = ? where id = ? ;";
    java.util.List<java.lang.Object> values = new java.util.ArrayList<java.lang.Object>();
    values.add(title);
    values.add(description);
    values.add(topicId);
    this.transactionOperation.beginTransaction();
    java.sql.ResultSet res = this.transactionOperation.exec(sql, values);
    this.transactionOperation.commitTransaction();
    return true;
}