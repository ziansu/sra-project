public static void main(java.lang.String[] args) throws com.rapplogic.xbee.api.XBeeException, java.io.IOException, java.lang.NumberFormatException, java.text.ParseException {
    initLog4j();
    if (false) {
        com.rapplogic.aru.uploader.xbee.XBeeSketchUploader.runFromCmdLine(args);
    }else {
        new com.rapplogic.aru.uploader.xbee.XBeeSketchUploader().process("/Users/andrew/Documents/dev/arduino-remote-uploader/resources/BlinkSlow.cpp.hex", "/dev/tty.usbserial-A6005uRz", java.lang.Integer.parseInt("9600"), "0013A200408B98FF", false, 5, 0, 500);
    }
}