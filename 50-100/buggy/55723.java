@java.lang.Override
public void selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent arg0) {
    net.viperfish.journal.swtGui.conf.ConfigPage p = ((net.viperfish.journal.swtGui.conf.ConfigPage) (((org.eclipse.jface.viewers.StructuredSelection) (arg0.getSelection())).getFirstElement()));
    if ((current) != null) {
        hideCurrent();
    }
    current = p.getDisplay();
    showCurrent();
}