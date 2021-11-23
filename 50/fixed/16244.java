@java.lang.Override
public void selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent event) {
    if ((event.getSelection()) != null) {
        okButton.setEnabled(true);
    }else {
        okButton.setEnabled(false);
    }
}