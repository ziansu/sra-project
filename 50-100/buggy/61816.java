@java.lang.Override
public void run() {
    org.eclipse.swt.widgets.Shell shell = getShell();
    if ((((fSnippetStateListeners) != null) && (shell != null)) && (!(shell.isDisposed()))) {
        java.util.List<org.eclipse.jdt.internal.debug.ui.snippeteditor.ISnippetStateChangedListener> v = new java.util.ArrayList<org.eclipse.jdt.internal.debug.ui.snippeteditor.ISnippetStateChangedListener>(fSnippetStateListeners);
        for (int i = 0; i < (v.size()); i++) {
            org.eclipse.jdt.internal.debug.ui.snippeteditor.ISnippetStateChangedListener l = v.get(i);
            l.snippetStateChanged(this);
        }
    }
}