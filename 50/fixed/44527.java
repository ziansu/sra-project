public void updateStatuses() {
    for (com.ChewieLouie.Topical.Topic topic : watchedTopics.values())
        topic.updateStatus();
    
}