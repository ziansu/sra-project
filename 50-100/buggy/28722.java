@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
    if ((sensorEvent.sensor.getType()) == (android.hardware.Sensor.TYPE_HEART_RATE)) {
        hrVal = ((int) (sensorEvent.values[0]));
        heart_rate_value.setText(hrVal);
        android.util.Log.e("Sensor:", ((hrVal) + ""));
        com.example.qianyiwang.httppostrequest.MainApp.SendMessageToPhone sendMessageToPhone = new com.example.qianyiwang.httppostrequest.MainApp.SendMessageToPhone();
        sendMessageToPhone.execute(("hr:" + (hrVal)));
    }else
        android.util.Log.d("Sensor:", "Unknown sensor type");
    
}