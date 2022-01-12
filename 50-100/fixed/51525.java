@java.lang.Override
public void componentResized(java.awt.event.ComponentEvent e) {
    if (null != (chartPanel)) {
        chartPanel.setMaximumDrawHeight(e.getComponent().getHeight());
        chartPanel.setMaximumDrawWidth(e.getComponent().getWidth());
        chartPanel.setMinimumDrawWidth(0);
        chartPanel.setMinimumDrawHeight(0);
        chartPanel.revalidate();
    }
}