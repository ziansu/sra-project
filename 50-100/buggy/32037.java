@java.lang.Override
public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
    if ((alphaLetterA.getParent().getElement().getChildNodes().getLength()) > 3) {
        alphaLetterA.removeFromParent();
        refreshOptionNames();
        removeToolTip.hide();
    }
}