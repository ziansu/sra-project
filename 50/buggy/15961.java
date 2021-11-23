@java.lang.Override
public boolean isEnabled() {
    return getPage().isZoomValid(getNewZoom());
}