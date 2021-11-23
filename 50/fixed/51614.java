public boolean deleteTopic(int topicId) throws java.lang.Exception {
    com.bupt.turtleservice.db.TopicDBFunction func = new com.bupt.turtleservice.db.TopicDBFunction(this.transactionOperation);
    func.deleteTopic(topicId);
    return true;
}