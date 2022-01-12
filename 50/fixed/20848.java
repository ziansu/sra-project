@java.lang.Override
public void onMouseOut(com.google.gwt.event.dom.client.MouseOutEvent event) {
    if ((info.chili.gwt.widgets.GenericPopup.instance()) != null) {
        info.chili.gwt.widgets.GenericPopup.instance().hide();
    }
}