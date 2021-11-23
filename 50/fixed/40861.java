private void calcgRes() {
    switch (GyroSettings.scale) {
        case 245 :
            GyroSettings.gRes = SENSITIVITY_GYROSCOPE_245;
            break;
        case 500 :
            GyroSettings.gRes = SENSITIVITY_GYROSCOPE_500;
            break;
        case 2000 :
            GyroSettings.gRes = SENSITIVITY_GYROSCOPE_2000;
            break;
        default :
            break;
    }
}