@java.lang.Override
public void run() {
    try {
        try {
            org.parabot.environment.api.utils.WindowsPreferences.userRoot().remove("Software\\JavaSoft\\Prefs");
        } catch (java.lang.Exception e) {
        }
        org.parabot.core.Context context = org.parabot.core.Context.getInstance(provider);
        context.load();
        org.parabot.core.ui.components.PaintComponent.getInstance().startPainting(context);
        org.parabot.core.parsers.randoms.RandomParser.enable();
    } catch (java.lang.Throwable t) {
        t.printStackTrace();
    }
}