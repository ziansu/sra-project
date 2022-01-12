@java.lang.Override
public void go(com.google.gwt.user.client.ui.LayoutPanel panel) {
    bind();
    panel.add(display.asWidget());
    panel.setWidgetRightWidth(display.asWidget(), 1, Unit.EM, 20, Unit.PCT);
    panel.setWidgetTopBottom(display.asWidget(), 4.5, Unit.EM, 1, Unit.EM);
}