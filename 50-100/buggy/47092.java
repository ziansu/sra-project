public static void precheckPortGroupParameter(java.lang.String volumeId, java.net.URI vpoolId, java.net.URI portGroup) {
    if ((com.emc.sa.service.vipr.block.BlockStorageUtils.isVMAXUsePortGroupEnabled(volumeId, vpoolId)) && (portGroup == null)) {
        com.emc.sa.engine.ExecutionUtils.fail("failTask.exportPortGroupParameters.precheck", new java.lang.Object[]{  }, new java.lang.Object[]{  });
    }
}