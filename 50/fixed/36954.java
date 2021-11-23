public static int getOptimalCommWorkerThreads() {
    int def = java.lang.Math.min(java.lang.Runtime.getRuntime().availableProcessors(), com.tc.net.utils.L2Utils.MAX_DEFAULT_COMM_THREADS);
    return com.tc.properties.TCPropertiesImpl.getProperties().getInt(TCPropertiesConsts.L2_TCCOM_WORKERTHREADS, def);
}