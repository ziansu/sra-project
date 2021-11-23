@java.lang.Override
protected void addPostClonePages() {
    addPage(this.selectRootPage);
    this.nestedProjectsPage = new org.eclipse.ui.internal.wizards.datatransfer.NestedProjectsWizardPage(this, this.selectRootPage);
    addPage(this.nestedProjectsPage);
}