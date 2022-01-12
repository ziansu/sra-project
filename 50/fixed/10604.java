protected int getWizardPageIndex(org.eclipse.jface.wizard.IWizardPage page) {
    org.eclipse.jface.wizard.IWizard pageWizard = page.getWizard();
    org.eclipse.jface.wizard.IWizardPage[] allPages = pageWizard.getPages();
    java.util.List<org.eclipse.jface.wizard.IWizardPage> arrayOfPages = java.util.Arrays.asList(allPages);
    return arrayOfPages.indexOf(page);
}