private void disableCharging() {
    com.faradice.firmware.Firmware.StatusLog sl = new com.faradice.firmware.Firmware.StatusLog(true, true, true, true, true, true, true, true);
    logAction(sl.faraStatus("Completed"), true);
    delay(100);
    pilot.sleep();
    delay(200);
    pilot.disable();
    chargingStartTime = 0;
    com.faradice.firmware.Firmware.currentID = null;
}