@java.lang.Override
public void selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent event) {
    org.eclipse.jface.viewers.IStructuredSelection selection = ((org.eclipse.jface.viewers.IStructuredSelection) (event.getSelection()));
    ca.setInitialModel(((eu.cloudscaleproject.env.analyser.alternatives.InputAlternative) (selection.getFirstElement())));
    ca.save();
}