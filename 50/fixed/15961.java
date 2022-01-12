@java.lang.Override
public boolean isEnabled() {
    return ((getPage()) != null) && (getPage().isZoomValid(getNewZoom()));
}