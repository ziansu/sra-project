@java.lang.Override
public void setIp(java.lang.String ip) {
    if ((mTCPlient) != null) {
        mSendHandler.obtainMessage(com.zhuozhi.monitor.MonitorService.START_CLIENT, mTCPlient.getPort(), 0, ip).sendToTarget();
    }
}