public void restoreLayout() {
    if (maximizableProperty.get()) {
        if (floatingProperty.get()) {
            stageFloatable.setX(0);
            stageFloatable.setY(0);
            stageFloatable.setMaximized(false);
            maximizingProperty.set(false);
        }else {
            if (station.restore(this)) {
                maximizingProperty.set(false);
            }
        }
    }
}