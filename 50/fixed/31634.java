public static jp.co.iret.sfq.SFQueueClientInterface newClient(java.lang.String quename) throws jp.co.iret.sfq.SFQueueClientException {
    return jp.co.iret.sfq.SFQueue.newClient(quename, new java.util.HashMap<java.lang.String, java.lang.Object>());
}