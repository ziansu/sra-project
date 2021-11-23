@java.lang.Override
public java.util.List<com.magnet.mmx.client.common.MMXMessage> doRun(com.magnet.mmx.client.MMXClient mmxClient) throws java.lang.Throwable {
    return mClient.getPubSubManager().getItems(mTopic, new com.magnet.mmx.protocol.TopicAction.FetchOptions().setMaxItems(25).setAscending(true));
}