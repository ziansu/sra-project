public synchronized void initLoggers(xyz.guyaaltonen.pickleirc.Connection connection) {
    xyz.guyaaltonen.pickleirc.ChannelLogger fn = new xyz.guyaaltonen.pickleirc.ChannelLogger(this, "#test");
    channelsToLog.add(fn);
}