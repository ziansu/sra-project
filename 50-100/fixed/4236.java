private org.apache.curator.framework.CuratorFramework instance() {
    if (null == (org.menina.tone.client.source.zookeeper.ZookeeperResourceLoader.client)) {
        synchronized(org.menina.tone.client.source.zookeeper.ZookeeperResourceLoader.class) {
            if (null == (org.menina.tone.client.source.zookeeper.ZookeeperResourceLoader.client)) {
                org.menina.tone.client.source.zookeeper.ZookeeperResourceLoader.client = org.apache.curator.framework.CuratorFrameworkFactory.newClient(this.getUrl(), 2000, 2000, new org.apache.curator.retry.ExponentialBackoffRetry(1000, 3));
                org.menina.tone.client.source.zookeeper.ZookeeperResourceLoader.client.start();
                org.menina.tone.client.source.zookeeper.ZookeeperResourceLoader.client.getCuratorListenable().addListener(new org.menina.tone.client.source.zookeeper.ZookeeperListener());
            }
        }
    }
    return org.menina.tone.client.source.zookeeper.ZookeeperResourceLoader.client;
}