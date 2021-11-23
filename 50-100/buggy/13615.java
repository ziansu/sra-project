@java.lang.Override
public void addFailTests() {
    addFailTest(new org.openhealthtools.mdht.uml.cda.mu2consol.tests.FailTest() {
        @java.lang.Override
        public void updateToFail(org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection target) {
        }
    });
    addFailTest(new org.openhealthtools.mdht.uml.cda.mu2consol.tests.FailTest() {
        @java.lang.Override
        public void updateToFail(org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection target) {
            target.init();
            target.getTemplateIds().clear();
            target.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.XX.XX.XX.X.XX"));
        }
    });
}