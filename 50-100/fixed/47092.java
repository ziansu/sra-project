public static void precheckPortGroupParameter(java.net.URI id, java.net.URI portGroup) {
    if ((com.emc.sa.service.vipr.block.BlockStorageUtils.isVMAXUsePortGroupEnabled(id)) && (portGroup == null)) {
        com.emc.sa.engine.ExecutionUtils.fail("failTask.exportPortGroupParameters.precheck", new java.lang.Object[]{  }, new java.lang.Object[]{  });
    }
}