public void maximizeLayout() {
    if (maximizableProperty.get()) {
        if (floatingProperty.get()) {
            stageFloatable.setMaximized(true);
        }else {
            station.maximize(this);
        }
        maximizingProperty.set(true);
    }
}