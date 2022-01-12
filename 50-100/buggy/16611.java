@java.lang.Override
public void stop() {
    try {
        connection.close();
        channel.close();
    } catch (java.lang.Exception e) {
        cn.shiyanjun.ddc.scheduling.platform.common.AbstractMQAccessService.LOG.warn(((("Failed to close: connection=" + (connection)) + ", channel=") + (channel)));
    }
}