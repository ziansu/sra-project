private void registerActiveTimer(K key, com.dataartisans.flink.dataflow.translation.wrappers.streaming.TimerInternals.TimerData timer) {
    java.util.List<com.dataartisans.flink.dataflow.translation.wrappers.streaming.TimerInternals.TimerData> timersForKey = activeTimers.get(key);
    if (timersForKey == null) {
        timersForKey = new java.util.ArrayList<>();
    }
    timersForKey.add(timer);
    activeTimers.put(key, timersForKey);
}