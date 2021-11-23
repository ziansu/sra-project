@java.lang.Override
protected void onUiThreadSuccess(java.lang.Object result) {
    if (result instanceof org.eclipse.swt.graphics.Image) {
        updateImage(((org.eclipse.swt.graphics.Image) (result)));
    }else {
        updateImage(com.google.gapid.image.Images.createNonScaledImage(widget.getDisplay(), ((org.eclipse.swt.graphics.ImageData) (result))));
    }
}