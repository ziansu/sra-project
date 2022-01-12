public void doDelete() {
    setExternalScholarshipPhdGratuityContribuitionEvent(null);
    setParty(null);
    org.fenixedu.academic.domain.accounting.events.gratuity.GratuityContributionFile document = getDocument();
    setDocument(null);
    document.delete();
    super.delete();
}