@java.lang.Override
public void run() {
    if ((monitor.isCanceled()) || (pdfDisplay.isDisposed())) {
        return ;
    }
    org.eclipse.swt.graphics.Image oldImage = pdfDisplay.getBackgroundImage();
    if (oldImage != null) {
        oldImage.dispose();
    }
    pdfDisplay.setBackgroundImage(swtImage);
    int width = awtImage.getWidth();
    int height = awtImage.getHeight();
    pdfDisplay.setSize(width, height);
    align();
    refreshToolbar();
}