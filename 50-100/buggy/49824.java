private void processAccelerometerData() {
    if (((tiltLeftRight) != 0) && ((tiltUpDown) != 0)) {
        mTextTiltLeftRight.setText(("" + ((tiltLeftRight) * (-1))));
        mTextTiltUpDown.setText(("" + (tiltUpDown)));
        if (!(isSensorControlEnabled)) {
            tiltLeftRight = 0;
            tiltUpDown = 0;
        }
        sendMovementData();
    }
}