private void registerActiveTimer(K key, com.dataartisans.flink.dataflow.translation.wrappers.streaming.TimerInternals.TimerData timer) {
    java.util.Set<com.dataartisans.flink.dataflow.translation.wrappers.streaming.TimerInternals.TimerData> timersForKey = activeTimers.get(key);
    if (timersForKey == null) {
        timersForKey = new java.util.HashSet<>();
    }
    timersForKey.add(timer);
    activeTimers.put(key, timersForKey);
}