@java.lang.Override
public void translatePercent(com.google.gwt.dom.client.Element el, double x, double y) {
    java.lang.String cssText = null;
    if ((has3d()) && (!(com.googlecode.mgwt.ui.client.MGWT.getOsDetection().isDesktop()))) {
        cssText = ((("translate3d(" + x) + "%, ") + y) + "%, 0px)";
    }else {
        cssText = ((("translate( " + x) + "%, ") + y) + "% )";
    }
    _translate(el, cssText);
}