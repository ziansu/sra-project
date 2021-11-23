private void init() {
    highPriorityBuffer = new cern.c2mon.shared.util.buffer.SynchroBuffer(100, 200, 100, cern.c2mon.shared.util.buffer.SynchroBuffer.DUPLICATE_OK, 10000);
    highPriorityBuffer.setSynchroBufferListener(new cern.c2mon.daq.common.messaging.impl.ProxyJmsSender.HighPriorityListener());
    highPriorityBuffer.enable();
    lowPriorityBuffer = new cern.c2mon.shared.util.buffer.SynchroBuffer(100, 500, 100, cern.c2mon.shared.util.buffer.SynchroBuffer.DUPLICATE_OK, 10000);
    lowPriorityBuffer.setSynchroBufferListener(new cern.c2mon.daq.common.messaging.impl.ProxyJmsSender.LowPriorityListener());
    lowPriorityBuffer.enable();
}