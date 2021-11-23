private void setStyleBarLongVisibility(boolean value) {
    if ((app.allowStylebar()) && ((titleBarPanel) != null)) {
        dockPanel.setWidgetSize(titleBarPanel, (value ? 44 : 0));
        titleBarPanel.setStyleName("TitleBarPanel-open", value);
        setLongStyleBar(value);
        deferredOnResize();
    }
}