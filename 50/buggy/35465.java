public static void saveIfUpdated() {
    if (com.snobot.xlib.PropertyManager.sPropertyAdded) {
        edu.wpi.first.wpilibj.Preferences.getInstance().save();
        java.lang.System.out.println("-------------------------------------------");
        java.lang.System.out.println("Config file updated, saving it");
        java.lang.System.out.println("-------------------------------------------");
        com.snobot.xlib.PropertyManager.sPropertyAdded = false;
    }
}