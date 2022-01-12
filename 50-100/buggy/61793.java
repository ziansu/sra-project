@java.lang.Override
public void keyReleased(final org.eclipse.swt.events.KeyEvent e) {
    if ((e.keyCode) == (org.eclipse.swt.SWT.ARROW_UP)) {
        this.increaseValue(this.increment);
    }
    if ((e.keyCode) == (org.eclipse.swt.SWT.ARROW_DOWN)) {
        this.decreaseValue(this.increment);
    }
    if ((e.keyCode) == (org.eclipse.swt.SWT.PAGE_UP)) {
        this.increaseValue(this.pageIncrement);
    }
    if ((e.keyCode) == (org.eclipse.swt.SWT.PAGE_DOWN)) {
        this.decreaseValue(this.pageIncrement);
    }
}