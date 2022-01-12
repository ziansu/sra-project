@java.lang.Override
protected void mountFlatGUI() {
    if ((getHostView()) != null) {
        getHostView().mountFlatGUI(widgets);
    }
}