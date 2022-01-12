public void createTrack(java.lang.String trackId, java.lang.String userId, java.lang.String entityClassName, java.util.List<java.lang.Object> beforeList, java.util.List<java.lang.Object> afterList, java.lang.String operation) {
    if (trackId == null) {
        return ;
    }
    if ((trackIdCache.getIfPresent(trackId)) == null) {
        com.xb.service.impl.WfTrackUtilFactory.executor.execute(new com.xb.utils.track.WfTrackJob(trackId, trackService, userId));
        trackIdCache.put(trackId, trackId);
    }
    com.xb.service.impl.WfTrackUtilFactory.executor.execute(new com.xb.utils.track.WfTrackLogJob(trackId, tracklogService, entityClassName, beforeList, afterList, operation));
}