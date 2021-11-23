public void mouseMoved(java.awt.event.MouseEvent arg0) {
    if ((view.isTimeline()) == false) {
        view.setToolText(arg0.getX(), arg0.getY());
        javax.swing.ToolTipManager.sharedInstance().setDismissDelay(12000);
        javax.swing.ToolTipManager.sharedInstance().registerComponent(view);
    }
}