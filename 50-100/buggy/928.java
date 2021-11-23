public void reg(java.lang.String host, java.lang.String queueHost, int queuePort, com.seveniu.crawlClient.ConsumerConfig consumerConfig, com.seveniu.consumer.Consumer consumer) {
    this.host = host;
    this.uuid = post((host + "/api/consumer/reg"), com.alibaba.fastjson.JSON.toJSONString(consumerConfig));
    this.taskQueue = new com.seveniu.crawlClient.TaskQueue(queueHost, queuePort, consumerConfig.getName());
    this.dataQueue = new com.seveniu.DataQueue(queueHost, queuePort, consumerConfig.getName(), consumer);
}