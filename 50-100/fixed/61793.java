@java.lang.Override
public void keyReleased(final org.eclipse.swt.events.KeyEvent e) {
    if ((e.keyCode) == (org.eclipse.swt.SWT.ARROW_UP)) {
        increaseValue(increment);
    }
    if ((e.keyCode) == (org.eclipse.swt.SWT.ARROW_DOWN)) {
        decreaseValue(increment);
    }
    if ((e.keyCode) == (org.eclipse.swt.SWT.PAGE_UP)) {
        increaseValue(pageIncrement);
    }
    if ((e.keyCode) == (org.eclipse.swt.SWT.PAGE_DOWN)) {
        decreaseValue(pageIncrement);
    }
}