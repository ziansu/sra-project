private void setupFiltersAndViews() {
    camRight = camLeft.clone();
    viewPortRight = app.getRenderManager().createPreView("Right viewport", camRight);
    viewPortRight.setClearFlags(false, false, true);
    viewPortRight.attachScene(this.app.getRootNode());
    camLeft.setViewPort(0.0F, 0.5F, 0.0F, 1.0F);
    camRight.setViewPort(0.5F, 1.0F, 0.0F, 1.0F);
}