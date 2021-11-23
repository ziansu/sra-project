public void setPosition(int popupWidth, int popupHeight) {
    if ((cursorBounds_) == null) {
        assert false : "Positioning popup but no cursor bounds available";
        return ;
    }
    org.rstudio.studio.client.workbench.views.console.shell.assist.PopupPositioner.Coordinates coords = org.rstudio.studio.client.workbench.views.console.shell.assist.PopupPositioner.getPopupPosition(popupWidth, popupHeight, cursorBounds_.getLeft(), cursorBounds_.getBottom(), 5);
    popup_.setPopupPosition(coords.getLeft(), coords.getTop());
}