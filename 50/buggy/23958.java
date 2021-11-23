public void upTracsitionReblance() throws java.lang.Exception {
    upReblance();
    updateMemBrokersNodeData();
    logstashHttpClient.sendImmediatelyLoadNodeData();
    sendLogPoolData();
    logstashHttpClient.sendImmediatelyLogPoolData();
}