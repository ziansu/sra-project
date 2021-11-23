private void doClientConnection() {
    android.util.Log.i(com.ajb.vendingmachine.service.MQTTService.TAG, "doClientConnection进行连接");
    if (com.ajb.vendingmachine.util.NetworkUtils.isConnected()) {
        if ((!(com.ajb.vendingmachine.service.MQTTService.client.isConnected())) && (!(isServiceOnDestroy))) {
            try {
                com.ajb.vendingmachine.service.MQTTService.client.connect(conOpt, null, connectCallBackHandler);
            } catch (org.eclipse.paho.client.mqttv3.MqttException e) {
                e.printStackTrace();
            }
        }
    }else {
        android.util.Log.i(com.ajb.vendingmachine.service.MQTTService.TAG, "当前网络无连接");
    }
}