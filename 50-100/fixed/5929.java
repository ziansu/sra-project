private void compute_speed() {
    float[] currentGPSReadings = mGPSListener.getCurrentValues();
    float tot_weight = (currentGPSReadings[1]) + ((float) (mAccPrecision));
    float gps_weight = (currentGPSReadings[1]) / tot_weight;
    float vel_weight = ((float) (mAccPrecision)) / tot_weight;
    mSpeed = ((mSpeedAccel) * vel_weight) + ((currentGPSReadings[0]) * gps_weight);
}