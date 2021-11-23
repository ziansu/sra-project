public static void createMachineNode(java.lang.String host) {
    try {
        com.gxf.util.EtcdUtil.etcd.put(((com.gxf.util.EtcdUtil.Etcd_Machine_Bath_Path) + host), com.gxf.util.EtcdUtil.Status_Add).send();
        com.gxf.util.EtcdUtil.logger.info("add machine list success, host:{}", host);
    } catch (java.lang.Exception e) {
        com.gxf.util.EtcdUtil.logger.error("add machine list failed, host:{}", host);
        com.gxf.util.EtcdUtil.logger.error(e.getMessage(), e);
    }
}