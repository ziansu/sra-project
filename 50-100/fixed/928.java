public void start(java.lang.String name, java.lang.String queueHost, int queuePort, com.seveniu.consumer.Consumer consumer) {
    this.taskQueue = new com.seveniu.crawlClient.TaskQueue(queueHost, queuePort, name);
    this.dataQueue = new com.seveniu.DataQueue(queueHost, queuePort, name, consumer);
    this.dataQueue.start();
}