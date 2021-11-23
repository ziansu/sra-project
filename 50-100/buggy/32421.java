@java.lang.Override
public void run(org.eclipse.jface.action.IAction action) {
    if ((((selectedResources) == null) || (selectedResources.isEmpty())) || ((window) == null)) {
        return ;
    }
    run(getRefactoringWizard(selectedResources, window), window.getShell());
}