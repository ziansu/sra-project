private org.eclipse.cdt.dsf.mi.service.MIStack.FramesCacheInfo getThreadFramesCache(int threadId) {
    org.eclipse.cdt.dsf.mi.service.MIStack.FramesCacheInfo info = get(threadId);
    if (info == null) {
        put(threadId, (info = new org.eclipse.cdt.dsf.mi.service.MIStack.FramesCacheInfo()));
    }
    return info;
}