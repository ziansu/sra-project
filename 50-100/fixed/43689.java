private java.lang.Integer getImmediateParentFormMessageLogs(int msgId) {
    java.lang.Integer immediateIndex = null;
    for (int i = (messageFlowLogs.size()) - 1; i >= 0; i--) {
        org.apache.synapse.aspects.newstatistics.StatisticsLog statisticsLog = messageFlowLogs.get(i);
        if ((statisticsLog.getMsgId()) == msgId) {
            immediateIndex = i;
            break;
        }
    }
    return immediateIndex;
}