protected void keyReleased(final java.awt.event.KeyEvent aEvent) {
    if ((aEvent.getID()) != (java.awt.event.KeyEvent.KEY_RELEASED)) {
        return ;
    }
    java.awt.Component comp = this.controller.getSignalDiagram();
    comp.setCursor(nl.lxtreme.test.view.SignalDiagramComponent.DEFAULT);
}