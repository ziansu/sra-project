@java.lang.Override
public void onTouchStart(com.google.gwt.event.dom.client.TouchStartEvent touchStartEvent) {
    com.vaadin.client.VConsole.log(" === TouchStart");
    com.google.gwt.dom.client.Element relativeElement = touchStartEvent.getRelativeElement();
    checkForButtonWidget(touchStartEvent.getNativeEvent());
    removeStyleVersions(touchArea.getElement().getStyle(), "transition");
    removeStyleVersions(touchArea.getElement().getStyle(), "transitionProperty");
    touchStartEvent.preventDefault();
    com.google.gwt.dom.client.Touch touch = touchStartEvent.getTouches().get(0);
    xDown = touch.getPageX();
    start = touch.getPageX();
}