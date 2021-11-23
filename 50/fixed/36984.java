public synchronized void stop() {
    if ((org.wso2.siddhi.launcher.internal.EditorDataHolder.getDebugRuntime()) != null) {
        org.wso2.siddhi.launcher.internal.DebugRuntime runtimeHolder = org.wso2.siddhi.launcher.internal.EditorDataHolder.getDebugRuntime();
        runtimeHolder.stop();
    }else {
        throw new org.wso2.siddhi.launcher.exception.NoSuchSiddhiAppException("Siddhi App %s does not exists");
    }
}