@java.lang.Override
public void onMessage(javax.jms.Message msg) {
    client.Client.print("onMessage");
    try {
        renderResponse(msg.getBody(common.ServerResponse.class));
        client.Client.stop = false;
    } catch (javax.jms.JMSException e) {
        e.printStackTrace();
    }
}