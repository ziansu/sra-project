private boolean isTaskDead(org.vudroid.core.AKDecodeService.DecodeTask currentDecodeTask) {
    synchronized(decodingFutures) {
        return !(decodingFutures.containsKey(currentDecodeTask.decodeKey));
    }
}