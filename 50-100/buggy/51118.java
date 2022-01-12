@java.lang.Override
public void onWeatherUpdate(java.lang.String[] weatherDetails) {
    try {
        tempValue.setText(((((weatherDetails[1]) + "�C | ") + (weatherDetails[2])) + "�C"));
        curTempValue.setText(((weatherDetails[3]) + "�C"));
        weatherImg.setImageResource(GetResourceID(weatherDetails[0]));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}