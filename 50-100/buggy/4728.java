@java.lang.Override
public void mousePressed(java.awt.event.MouseEvent e) {
    if ((e.getButton()) == (java.awt.event.MouseEvent.BUTTON1)) {
        selectionBegin = e.getX();
        selectionEnd = e.getX();
        selectionInProcess = true;
        for (ru.dso.nano.v3.analyzer.gui.SelectionListener listener : selectionListeners) {
            listener.onSelectionStart(selectionBegin);
        }
    }
}