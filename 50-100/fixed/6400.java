@java.lang.Override
public void run() {
    try {
        org.parabot.core.Context context = org.parabot.core.Context.getInstance(provider);
        context.load();
        org.parabot.core.ui.components.PaintComponent.getInstance().startPainting(context);
        org.parabot.core.parsers.randoms.RandomParser.enable();
    } catch (java.lang.Throwable t) {
        t.printStackTrace();
    }
}