@java.lang.Override
public void savePosition(final java.lang.Runnable runnable) {
    final org.eclipse.vex.core.provisional.dom.IPosition pos = document.createPosition(getCaretOffset());
    try {
        runnable.run();
    } finally {
        this.moveTo(new org.eclipse.vex.core.provisional.dom.ContentPosition(document, pos.getOffset()));
    }
}