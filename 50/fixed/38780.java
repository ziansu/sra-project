@java.lang.Override
public void handleLengthChange(ui.events.GuiEventsLengthChange e) {
    if (DEBUG) {
        java.lang.System.out.println("Changing Length");
    }
    CONTROLLER.setLength(e.getAlgorithm());
    update();
}