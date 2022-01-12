public static void main(java.lang.String[] args) throws com.rapplogic.xbee.api.XBeeException, gnu.io.PortInUseException, gnu.io.UnsupportedCommOperationException, java.io.IOException, java.lang.NumberFormatException, java.text.ParseException, java.util.TooManyListenersException {
    initLog4j();
    new com.rapplogic.aru.uploader.nordic.NordicSketchUploader().process("/Users/andrew/Documents/dev/arduino-remote-uploader/resources/RAU-328-13k.hex", "/dev/tty.usbmodemfa131", java.lang.Integer.parseInt("19200"), "????", 5, 0, 50, false, 5);
}