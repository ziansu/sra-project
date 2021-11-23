private boolean isTaskDead(org.vudroid.core.AKDecodeService.DecodeTask currentDecodeTask) {
    {
        return !(decodingFutures.containsKey(currentDecodeTask.decodeKey));
    }
}