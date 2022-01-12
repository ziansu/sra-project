public void selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent event) {
    selectionChanged(((org.eclipse.jface.text.ITextSelection) (event.getSelection())));
}