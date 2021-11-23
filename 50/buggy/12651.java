private void closeFloatingStage() {
    if ((stageFloatable) != null) {
        stageFloatable.closeStage();
        stageFloatable = null;
    }
    floatingProperty.set(false);
}