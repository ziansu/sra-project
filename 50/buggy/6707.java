@java.lang.Override
public void run() {
    try {
        utility.ReadConfig reader = new utility.ReadConfig();
        new launcher.LauncherGUI(true, reader.readPropertyBool(ReadConfig.WIDGETS));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}