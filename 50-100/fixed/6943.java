public static void registerSingleThreadVirtualTarget(java.lang.Thread thread, java.lang.String targetName) {
    pj.pr.target.VirtualTarget virtualTarget = pj.PjRuntime.targetExecutorMap.get(targetName);
    if (null == virtualTarget) {
        virtualTarget = new pj.pr.target.SingleThreadVirtualTarget(targetName, thread);
        pj.PjRuntime.targetExecutorMap.put(targetName, virtualTarget);
    }else {
    }
}