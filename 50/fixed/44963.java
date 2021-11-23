@java.lang.Override
public void run() {
    new com.wowza.wms.plugin.streamresolver.UDPServer(udpPort, host, com.wowza.wms.logging.WMSLoggerFactory.getLogger(getClass()), debug);
}