public void restoreLayout() {
    if (maximizableProperty.get()) {
        if (floatingProperty.get()) {
            stageFloatable.setX(0);
            stageFloatable.setY(0);
            stageFloatable.setMaximized(false);
        }else {
            station.restore(this);
        }
        maximizingProperty.set(false);
    }
}