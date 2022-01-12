public void calcmRes() {
    switch (MagSettings.scale) {
        case 4 :
            MagSettings.mRes = SENSITIVITY_MAGNETOMETER_4;
            break;
        case 8 :
            MagSettings.mRes = SENSITIVITY_MAGNETOMETER_8;
            break;
        case 12 :
            MagSettings.mRes = SENSITIVITY_MAGNETOMETER_12;
            break;
        case 16 :
            MagSettings.mRes = SENSITIVITY_MAGNETOMETER_16;
            break;
    }
}