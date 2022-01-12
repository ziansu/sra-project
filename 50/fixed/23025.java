@java.lang.Override
public void handleEvent(final org.eclipse.swt.widgets.Event event) {
    adaptIncrements(scrolledComposite.getVerticalBar(), org.jowidgets.spi.impl.swt.common.widgets.ScrollCompositeImpl.SCROLL_SPEED_FACTOR);
    adaptIncrements(scrolledComposite.getHorizontalBar(), org.jowidgets.spi.impl.swt.common.widgets.ScrollCompositeImpl.SCROLL_SPEED_FACTOR);
}