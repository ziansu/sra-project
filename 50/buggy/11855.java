@java.lang.Override
public boolean isViewAtBottom() {
    return ((getView().getBottom()) + (getMarginBottom())) >= (getParentView().getHeight());
}