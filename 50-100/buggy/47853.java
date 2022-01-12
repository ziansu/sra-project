private void blinkLight(final org.robbins.raspberry.pi.service.GpioPinDigitalOutput pin, int blinkCount) throws org.robbins.raspberry.pi.exceptions.RaspberryPiAppException {
    try {
        for (int i = 0; i < blinkCount; i++) {
            org.robbins.raspberry.pi.service.BlinkLightActionImpl.LOGGER.debug("--> GPIO state should be: ON");
            java.lang.Thread.sleep(5000);
            pin.low();
            org.robbins.raspberry.pi.service.BlinkLightActionImpl.LOGGER.debug("--> GPIO state should be: OFF");
            java.lang.Thread.sleep(5000);
        }
    } catch (java.lang.InterruptedException e) {
        org.robbins.raspberry.pi.service.BlinkLightActionImpl.LOGGER.debug(e.getMessage());
        throw new org.robbins.raspberry.pi.exceptions.RaspberryPiAppException(e.getMessage());
    }
}