@java.lang.Override
public void onMessageReceived(uk.co.maxtingle.communication.client.Client client, uk.co.maxtingle.communication.common.Message message) throws java.lang.Exception {
    com.mt.easytv.activities.CommandResponse.setResponse(message);
    this.setIntent(new android.content.Intent(this, com.mt.easytv.activities.CommandResponse.class));
}