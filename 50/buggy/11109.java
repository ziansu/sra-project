@java.lang.Override
protected void mountFlatGUI() {
    if (promoteToView(true)) {
        getHostView().mountFlatGUI(widgets);
    }else {
        mWidgetGroup.replaceAll(widgets);
    }
}