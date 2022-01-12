private <T> T doCall(final java.lang.String pool, final java.lang.String imageName, final com.emc.storageos.ceph.CephNativeClient.RbdImageOperationT<T> rbdImageOp, final java.lang.String errorMsg, final java.lang.Object... errorMsgArgs) {
    com.emc.storageos.ceph.CephNativeClient.RbdOperationT<T> op = (com.ceph.rbd.Rbd rbd) -> {
        com.ceph.rbd.RbdImage image = rbd.open(imageName);
        try {
            return rbdImageOp.call(image);
        } finally {
            rbd.close(image);
        }
    };
    return doCall(pool, op, errorMsg, errorMsgArgs);
}