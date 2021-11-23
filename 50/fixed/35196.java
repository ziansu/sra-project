private cern.c2mon.daq.common.messaging.JmsSender proxyJmsSender() {
    return new cern.c2mon.daq.common.messaging.impl.ProxyJmsSender(secondActiveJmsSender());
}