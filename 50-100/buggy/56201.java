private void closeResources() {
    if (com.jthink.skyeye.client.core.producer.LazySingletonProducer.isInstanced()) {
        com.jthink.skyeye.client.core.producer.LazySingletonProducer.getInstance(this.config).close();
    }
    org.I0Itec.zkclient.ZkClient client = ((this.zkRegister) == null) ? null : this.zkRegister.getClient();
    if (null != client) {
        client.close();
    }
}