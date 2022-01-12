private void removeExpiredOutages(long curTime, long rollingWindow) {
    long startTime = curTime - rollingWindow;
    java.util.ListIterator<org.opennms.netmgt.rtc.datablock.RTCNodeSvcTime> iter = listIterator();
    while (iter.hasNext()) {
        org.opennms.netmgt.rtc.datablock.RTCNodeSvcTime svcTime = ((org.opennms.netmgt.rtc.datablock.RTCNodeSvcTime) (iter.next()));
        if ((svcTime.getLostTime()) >= startTime) {
            break;
        }
        if (svcTime.hasExpired(startTime)) {
            iter.remove();
        }
    } 
}