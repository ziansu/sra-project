private void resetTransforms() {
    getContentGroup().getTransforms().clear();
    getContentGroup().getTransforms().addAll(getTmain(), getRxmain(), getRymain(), getRzmain());
    setupTransforms(getDragEnum());
}