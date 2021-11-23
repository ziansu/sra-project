@java.lang.Override
public void translate(com.google.gwt.dom.client.Element el, int x, int y) {
    java.lang.String cssText = null;
    if ((has3d()) && (!(com.googlecode.mgwt.ui.client.MGWT.getOsDetection().isDesktop()))) {
        cssText = ((("translate3d(" + x) + "px, ") + y) + "px, 0px)";
    }else {
        cssText = ((("translate( " + x) + "px, ") + y) + "px )";
    }
    _translate(el, cssText);
}