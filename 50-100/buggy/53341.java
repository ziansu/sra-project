private void updateDisplay() {
    if ((mDisplay) != null) {
        try {
            switch (mDisplayMode) {
                case TEMPERATURE :
                    mDisplay.display(mLastTemperature);
                    break;
                case PRESSURE :
                    mDisplay.display(mLastPressure);
                    break;
                case HUMIDITY :
            }
        } catch (java.io.IOException e) {
            android.util.Log.e(com.example.androidthings.weatherstation.WeatherStationActivity.TAG, "Error setting display", e);
        }
    }
}