private void disableCharging() {
    delay(100);
    pilot.sleep();
    delay(200);
    pilot.disable();
    com.faradice.firmware.Firmware.StatusLog sl = new com.faradice.firmware.Firmware.StatusLog(false, false, true, true, true, true, true, false);
    logAction(sl.faraStatus("Completed"), true);
    chargingStartTime = 0;
    com.faradice.firmware.Firmware.currentID = null;
}