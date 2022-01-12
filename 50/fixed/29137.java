public br.com.criativasoft.opendevice.connection.DeviceConnection setup() {
    led = new br.com.criativasoft.opendevice.core.model.Device(1, br.com.criativasoft.opendevice.core.model.Device.DIGITAL);
    return Connections.out.usb();
}