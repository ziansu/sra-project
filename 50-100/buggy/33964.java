public static void main(java.lang.String[] args) throws java.io.IOException {
    cona.pi.Main.readProps();
    cona.pi.Ping ping = new cona.pi.Ping(cona.pi.Main.props.getProperty("rangefinder-topic"), cona.pi.Main.props.getProperty("ip"), cona.pi.Main.props.getProperty("rangefinderSensorID"), true, cona.pi.Main.props.getProperty("USBdevice"));
    cona.pi.Button button = new cona.pi.Button(cona.pi.Main.props.getProperty("button-topic"), cona.pi.Main.props.getProperty("ip"), cona.pi.Main.props.getProperty("buttonSensorID"), true);
    ping.start();
    button.start();
}