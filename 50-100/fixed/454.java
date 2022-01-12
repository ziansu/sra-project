public void maximizeLayout() {
    if (maximizableProperty.get()) {
        if (floatingProperty.get()) {
            stageFloatable.setMaximized(true);
            maximizingProperty.set(true);
        }else {
            if (station.maximize(this)) {
                maximizingProperty.set(true);
            }
        }
    }
}