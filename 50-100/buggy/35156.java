public void openDetachedPreview() {
    closeDetachedPreview();
    detachedPreviewWindow = new org.jwildfire.create.tina.swing.DetachedPreviewWindow();
    detachedPreviewController = new org.jwildfire.create.tina.swing.DetachedPreviewController(detachedPreviewWindow, data.toggleDetachedPreviewButton);
    detachedPreviewWindow.setController(detachedPreviewController);
    detachedPreviewWindow.getFrame().setVisible(true);
    detachedPreviewController.setFlame(getCurrFlame());
}