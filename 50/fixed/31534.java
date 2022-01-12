@java.lang.Override
public void onMessageCheck(org.kiteq.client.message.TxResponse response) {
    org.kiteq.standalone.KiteProducer.logger.warn(org.kiteq.commons.util.JsonUtils.prettyPrint(response));
    response.commit();
}