public <T extends java.io.Serializable> void setData(java.lang.String path, T t) throws java.lang.Exception {
    byte[] payload = com.emc.ehc.cloudkeeper.utils.Object2ByteUtils.serialize(t);
    if (!(com.emc.ehc.cloudkeeper.utils.ZooKeeperClientUtils.isPathExist(zkClient, path))) {
        com.emc.ehc.cloudkeeper.utils.ZooKeeperClientUtils.createNode(zkClient, path);
    }
    zkClient.setData().forPath(path, payload);
}