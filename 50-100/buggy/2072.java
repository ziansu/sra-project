@java.lang.Override
public void setTranslateAndZoom(com.google.gwt.dom.client.Element el, int x, int y, double scale) {
    java.lang.String cssText = null;
    cssText = ((((("translate( " + x) + "px, ") + y) + "px ) scale( + ") + scale) + ")";
    el.getStyle().setProperty("MozTransform", cssText);
}