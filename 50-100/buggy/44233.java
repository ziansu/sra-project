public void calcaRes() {
    switch (AccelSettings.scale) {
        case 2 :
            AccelSettings.aRes = SENSITIVITY_ACCELEROMETER_2;
            break;
        case 4 :
            AccelSettings.aRes = SENSITIVITY_ACCELEROMETER_4;
            break;
        case 8 :
            AccelSettings.aRes = SENSITIVITY_ACCELEROMETER_8;
            break;
        case 16 :
            AccelSettings.aRes = SENSITIVITY_ACCELEROMETER_16;
            break;
        default :
            break;
    }
}