@java.lang.Override
public void addPages() {
    this.page = new eu.modelwriter.marker.ui.internal.wizards.mappingwizard.MarkerMatchPage();
    super.addPages();
    this.addPage(this.page);
}