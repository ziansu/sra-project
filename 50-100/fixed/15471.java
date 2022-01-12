@java.lang.Override
public void answerReceived(fr.lteconsulting.hexa.client.comm.RPCBatchRequestSender sender) {
    nbReceivedBytes += sender.getNbReceivedBytes();
    batchRequestSenders.remove(sender);
    for (fr.lteconsulting.hexa.client.comm.RequestCallInfo info : sender.sentRequests) {
        if ((info.msg.length()) > 0)
            callback.signalServerCommMessage(info.msgLevel, info.msg);
        
        if ((info.msgLevel) == 1)
            continue;
        
        if ((info.hangout) != null) {
            hangOut(info, info.hangout);
        }else {
            info.giveResultToCallbacks();
        }
    }
    statusRefresh();
    scheduleSend();
}