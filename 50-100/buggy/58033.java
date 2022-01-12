public java.util.List<de.slackspace.tinkerled.device.Led> prepareRangeLeds(int fromIndex, int size, java.lang.String colorHexTriplet, java.util.List<de.slackspace.tinkerled.device.Led> leds) {
    for (int i = fromIndex; i < (fromIndex + size); i++) {
        leds.add(new de.slackspace.tinkerled.device.Led(i, colorHexTriplet));
    }
    return leds;
}