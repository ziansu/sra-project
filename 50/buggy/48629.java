@java.lang.Override
public void addPages() {
    setWindowTitle("New Atomic project");
    detailsPage = new de.uni_jena.iaa.linktype.atomic.core.projects.NewAtomicProjectWizardDetailsPage();
    addPage(detailsPage);
    sentenceDetectionPage = new de.uni_jena.iaa.linktype.atomic.core.projects.NewAtomicProjectWizardSentenceDetectionPage("Sentence detection");
    addPage(sentenceDetectionPage);
}