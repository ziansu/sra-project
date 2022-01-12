@java.lang.Override
public void onEvent(uk.co.hexeption.darkforge.event.Event event) {
    if (getState()) {
        if (event instanceof uk.co.hexeption.darkforge.event.events.EventKeyboard) {
            if ((event.getType()) == (Event.Type.PRE)) {
                mc.displayGuiScreen(DarkForge.INSTANCE.getGui());
                onDisable();
            }
        }
    }
}