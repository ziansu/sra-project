@java.lang.Override
public void onFailure(org.eclipse.paho.client.mqttv3.IMqttToken asyncActionToken, java.lang.Throwable exception) {
    android.util.Log.i(com.ajb.vendingmachine.service.MQTTService.TAG, "subscribeCallBackHandler订阅失败 ");
    exception.printStackTrace();
    doClientConnection();
}