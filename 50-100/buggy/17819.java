public DeviceManagement.Device RegisterDevice(java.lang.String name, java.lang.String IP, int PORT, java.lang.String MAC, java.lang.String AUTH) {
    DeviceManagement.Device d = GetDevice(name);
    if (d == null) {
        d = new DeviceManagement.Device(name, IP, PORT, MAC, AUTH);
    }
    d.IP = IP;
    d.PORT = PORT;
    d.MAC = MAC;
    d.AUTH = AUTH;
    mDevices.add(d);
    return d;
}