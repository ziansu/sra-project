@java.lang.Override
public void componentResized(java.awt.event.ComponentEvent e) {
    if (null != (chartPanel)) {
        java.lang.System.err.println("component resized");
        chartPanel.setMaximumDrawHeight(e.getComponent().getHeight());
        chartPanel.setMaximumDrawWidth(e.getComponent().getWidth());
        chartPanel.setMinimumDrawWidth(0);
        chartPanel.setMinimumDrawHeight(0);
        chartPanel.revalidate();
    }
}