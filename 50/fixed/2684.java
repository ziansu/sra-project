public void requestFinalize() {
    ecs160.deliveries.API.finalize(pID, mUID);
    finalize_button.setEnabled(false);
}