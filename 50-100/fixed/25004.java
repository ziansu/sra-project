public static void readInRegisteredDevices() throws java.io.FileNotFoundException, java.io.IOException, java.lang.ClassNotFoundException {
    java.io.File f = new java.io.File(((wetsch.jbcsserver.tools.Tools.getApplicationDir()) + "/Registered_devices.jdb"));
    if (!(f.exists())) {
        return ;
    }
    java.io.ObjectInputStream ois = new java.io.ObjectInputStream(new java.io.FileInputStream(f));
    wetsch.jbcsserver.server.registrationsystem.RegisteredDevices.devices = ((wetsch.jbcsserver.server.registrationsystem.RegisteredDevices) (ois.readObject()));
    ois.close();
}