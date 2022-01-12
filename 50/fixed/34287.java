public void watch(java.lang.String name, org.flg.hiromi.pulsecontroller.PulseCommChannel.IntWatcher cb) {
    java.util.List<org.flg.hiromi.pulsecontroller.PulseCommChannel.IntWatcher> ws = getWatchers(name);
    ws.add(cb);
    getIntParam(name);
}