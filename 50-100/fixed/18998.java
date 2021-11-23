public static void main(java.lang.String[] args) throws java.lang.Exception {
    org.apache.curator.RetryPolicy retryPolicy = new org.apache.curator.retry.ExponentialBackoffRetry(1000, 3);
    org.apache.curator.framework.CuratorFramework framework = org.apache.curator.framework.CuratorFrameworkFactory.newClient(((com.andyadc.zookeeper.study.basic.curator.CreateSession.IP) + ":2191"), 5000, 5000, retryPolicy);
    framework.start();
    java.lang.String result = framework.create().creatingParentsIfNeeded().withMode(CreateMode.EPHEMERAL).forPath("/curator/c1", "123".getBytes());
    java.lang.System.out.println(result);
    framework.close();
}