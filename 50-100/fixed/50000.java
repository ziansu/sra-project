private void initView(android.view.View view) {
    mainContainer = ((android.widget.LinearLayout) (view.findViewById(R.id.lightSensorContainer)));
    lightSensorViewContainer = ((android.widget.LinearLayout) (view.findViewById(R.id.light_sensor_summary_canvas)));
    lightIndicatorView = new sk.stuba.fei.hmi_androidsensors.LightSensor.LightIndicatorView(context);
    lightSensorViewContainer.addView(lightIndicatorView);
}