public void startLoop(java.lang.String filepath, trips.CarActionsFilter... filter) {
    java.util.Set<trips.CarActionsFilter> filters = new java.util.HashSet(java.util.Arrays.asList(filter));
    streamer = new trips.DataStreamSimulator(filepath, filters);
    streamer.addStreamListener(this);
    streamer.startStreamingLoop();
}