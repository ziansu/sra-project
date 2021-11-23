@java.lang.Override
public void run() {
    if (((receiveState) == (wekimini.osc.OSCMonitor.OSCReceiveState.CONNECTED_NODATA)) && (hasReceivedRecently)) {
        setReceiveState(wekimini.osc.OSCMonitor.OSCReceiveState.RECEIVING);
    }else
        if ((((receiveState) == (wekimini.osc.OSCMonitor.OSCReceiveState.RECEIVING)) || ((receiveState) == (wekimini.osc.OSCMonitor.OSCReceiveState.CONNECTED_NODATA))) && (!(hasReceivedRecently))) {
            setReceiveState(wekimini.osc.OSCMonitor.OSCReceiveState.CONNECTED_NODATA);
        }
    
    if ((isSending) != (hasSentRecently)) {
        setIsSending(hasSentRecently);
    }
    hasReceivedRecently = false;
    hasSentRecently = false;
}