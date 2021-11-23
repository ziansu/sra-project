@java.lang.Override
public void controlResized(org.eclipse.swt.events.ControlEvent e) {
    if (!(browser.isVisible())) {
        logger.debug("Invisible, skipping");
        return ;
    }
    updateClientSize();
}