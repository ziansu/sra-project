@java.lang.Override
public void mouseDown(org.eclipse.swt.events.MouseEvent e) {
    if (hlShell.isDisposed()) {
        removeListeners();
        return ;
    }
    if ((e.button) == 1) {
        onBoardingManager.close();
    }
}