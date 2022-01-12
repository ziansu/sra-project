@java.lang.Override
public void updateControlImage(final org.eclipse.swt.graphics.Image image, final int index) {
    if (IS_LINUX_OS) {
        compImage[(index - 1)] = image;
    }
}