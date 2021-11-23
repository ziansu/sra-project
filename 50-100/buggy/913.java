public static boolean currentThreadIsTheTarget(java.lang.String targetName) {
    if ((java.lang.Thread.currentThread()) instanceof pj.pr.target.TargetWorkerThread) {
        if (((pj.pr.target.TargetWorkerThread) (java.lang.Thread.currentThread())).targetName().equals(targetName)) {
            return true;
        }
    }
    return pj.PjRuntime.currentThreadIsSingleThreadTarget(targetName);
}