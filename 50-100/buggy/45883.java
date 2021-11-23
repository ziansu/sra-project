@java.lang.Override
public void initialise() {
    overlay = nuiManager.addOverlay(org.terasology.logic.console.ConsoleSystem.MINICHAT_UI, org.terasology.logic.console.ui.MiniChatOverlay.class);
    console.subscribe((org.terasology.logic.console.Message message) -> {
        if (!(nuiManager.isOpen("engine:console"))) {
            overlay.setVisible(true);
        }
    });
    overlay.setVisible(true);
}