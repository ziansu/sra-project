public void createNode(java.lang.String path) {
    try {
        client.create().creatingParentsIfNeeded().withMode(nodeMode).forPath(path);
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(("Failed to create node: " + path), e);
    }
}