protected void createNexthopPointerPool() {
    org.opendaylight.yang.gen.v1.urn.opendaylight.vpnservice.idmanager.rev150403.CreateIdPoolInput createPool = new org.opendaylight.yang.gen.v1.urn.opendaylight.vpnservice.idmanager.rev150403.CreateIdPoolInputBuilder().setPoolName("nextHopPointerPool").setIdStart(1L).setPoolSize(new java.math.BigInteger("65535")).build();
    java.util.concurrent.Future<org.opendaylight.yangtools.yang.common.RpcResult<java.lang.Void>> result = idManager.createIdPool(createPool);
}