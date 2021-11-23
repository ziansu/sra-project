public void toggleLights(android.view.View view) {
    android.widget.ImageButton lightButton = ((android.widget.ImageButton) (findViewById(R.id.lights_onoff)));
    if (lightButton != null) {
        if (light.isOn()) {
            lightButton.setImageResource(R.drawable.lightbulb_off);
            if ((raspiClient) != null) {
                raspiClient.sendMessage("LightOff");
            }
        }else {
            lightButton.setImageResource(R.drawable.lightbulb_on);
            if ((raspiClient) != null) {
                raspiClient.sendMessage("LightOn");
            }
        }
    }
    light.toggleLight();
}