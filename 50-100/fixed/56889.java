@java.lang.Override
public void run() {
    java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
    java.lang.String s = sc.nextLine();
    try {
        com.narvis.engine.NarvisEngine.getInstance().getMessage(getMessage(s));
    } catch (java.lang.Exception ex) {
        com.narvis.common.debug.NarvisLogger.getInstance().getLogger().log(java.util.logging.Level.SEVERE, ex.getMessage());
    }
}